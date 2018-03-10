package cc.sku.base;

public enum BaseResultConstant {

    SUCCESS(0, "success"),
    FAILED(1, "failed"),

    INVALID_PARAM(10001, "Invalid param"),
    INVALID_PRODCUTID(10102, "Invalid product id");

    public int code;
    public String message;

    BaseResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
