package cc.sku.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="sku_product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="product_id")
    private Long productId;

    private String barcode;
    private String name;
    @Column(name="en_name")
    private String enName;

    private String type;

    @Column(name="dosage_form")
    private String dosageForm;
    private String specifications;

    private String unit;
    private String manufacturer;
    private String address;
    @Column(name="approval_number")
    private String approvalNumber;

    @Column(name="approval_date")
    private String approvalDate;

    @Column(name="create_time")
    private long createTime;

    private static final long serialVersionUID = 1L;

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }
    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDosageForm() {
        return dosageForm;
    }
    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getSpecifications() {
        return specifications;
    }
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }
    public void setApprovalNumber(String approvalNumber) {
        this.address = approvalNumber;
    }

    public String getApprovalDate() {
        return approvalDate;
    }
    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", barcode=").append(barcode);
        sb.append(", name=").append(name);
        sb.append(", enName=").append(enName);
        sb.append(", dosageForm=").append(dosageForm);
        sb.append(", specifications=").append(specifications);
        sb.append(", type=").append(type);
        sb.append(", unit=").append(unit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", address=").append(address);
        sb.append(", approvalNumber=").append(approvalNumber);
        sb.append(", approvalDate=").append(approvalDate);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
                && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
                && (this.getDosageForm() == null ? other.getDosageForm() == null : this.getDosageForm().equals(other.getDosageForm()))
                && (this.getSpecifications() == null ? other.getSpecifications() == null : this.getSpecifications().equals(other.getSpecifications()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
                && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
                && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getApprovalNumber() == null ? other.getApprovalNumber() == null : this.getApprovalNumber().equals(other.getApprovalNumber()))
                && (this.getApprovalDate() == null ? other.getApprovalDate() == null : this.getApprovalDate().equals(other.getApprovalDate()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEnName() == null) ? 0 : getEnName().hashCode());
        result = prime * result + ((getDosageForm() == null) ? 0 : getDosageForm().hashCode());
        result = prime * result + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getApprovalNumber() == null) ? 0 : getApprovalNumber().hashCode());
        result = prime * result + ((getApprovalDate() == null) ? 0 : getApprovalDate().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}
