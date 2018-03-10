package cc.sku.jpa.repository;

import cc.sku.jpa.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
    /**
     * 根据 productId 获取 product
     * @param productId
     * @return`
     */
    public Product findByProductId(Long productId);

    /**
     * 根据userId获取UserInfo
     * @param barcode
     * @return
     */
    public Product findByBarcode(String barcode);
}
