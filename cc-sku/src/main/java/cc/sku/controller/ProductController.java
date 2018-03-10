package cc.sku.controller;

import cc.sku.base.BaseResult;
import cc.sku.base.BaseResultConstant;
import cc.sku.jpa.domain.Product;
import cc.sku.jpa.repository.ProductRepository;
import com.alibaba.fastjson.JSONObject;
// import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private static Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductRepository productRepository;

    // @Autowired
    // private UserInfoService userService;

//    @RequestMapping("/api/products")
//    public Object getAllProducts() {
//        UserInfo userInfo = userService.findByUserName(name);
//
//        // 使用DTO，防止db修改，客户端也要修改code
//        JSONObject user = new JSONObject();
//        user.put("id", userInfo.getUserId());
//        user.put("user_name", userInfo.getUsername());
//        user.put("realname", userInfo.getRealname());
//        user.put("avatar", userInfo.getAvatar());
//        user.put("phone", userInfo.getPhone());
//        user.put("email", userInfo.getEmail());
//
//        return new OauthResult(OauthResultConstant.SUCCESS, userInfo);
//    }
//
//    //@RequiresPermissions("upms:user:read")
//    @RequestMapping(value="/api/product/{product_id}", method= RequestMethod.GET)
//    public ProductInfo getUser(@PathVariable Long productId) {
//        return null;
//    }
//
//    @RequestMapping(value="/api/user/{userId}", method=RequestMethod.DELETE)
//    public ProductInfo deleteUser(@PathVariable Long userId) {
//        return null;
//    }

    @RequestMapping("/api/products")
    public Object getAllProducts() {
        // log.info("api/products : userId={}", userId);
        log.info("api/products");

        JSONObject product = new JSONObject();
        product.put("id", "123123");
        product.put("name", "药品");

        BaseResultConstant result = BaseResultConstant.SUCCESS;

        return new BaseResult(result.getCode(), result.getMessage(), product);
    }

    @RequestMapping(value="/api/product/{productId}", method=RequestMethod.GET)
    public Object deleteUser(@PathVariable Long productId) {
        Product product = productRepository.findByProductId(productId);
        if (null == product) {
            log.info("findProductByProductId : productId={}", productId);
            return null;
        }
        BaseResultConstant result = BaseResultConstant.SUCCESS;

        return new BaseResult(result.getCode(), result.getMessage(), product);
    }
}
