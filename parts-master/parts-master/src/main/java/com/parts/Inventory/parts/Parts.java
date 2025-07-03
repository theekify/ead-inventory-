package com.parts.Inventory.parts;

import jakarta.persistence.*;

@Entity
@Table(name ="Parts")
public class Parts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partId")
    private int partId;

    private String partName;
    private String serialnumber;
    private int quantity;
    private String category;
    private String warrantyDate;
    public float price;

    public Parts() {

    }
    public Parts(String partName, String serialnumber, int quantity, String category, String warrantyDate, float price) {
        this.partName = partName;
        this.serialnumber = serialnumber;
        this.quantity = quantity;
        this.category = category;
        this.warrantyDate = warrantyDate;
        this.price = price;

    }
    public Parts(int partId,String partName, String serialnumber, int quantity, String category, String warrantyDate, float price) {
        this.partId = partId;
        this.partName = partName;
        this.serialnumber = serialnumber;
        this.quantity = quantity;
        this.category = category;
        this.warrantyDate =warrantyDate;
        this.price = price;
    }


    public int getPartId() {
        return partId;
    }

    public String getPartName() {
        return partName;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getWarrantyDate() {
        return warrantyDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWarrantyDate(String warrantyDate) {
        this.warrantyDate = warrantyDate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "partId=" + partId +
                ", partName=" + partName + '\'' +
                ", serialnumber=" + serialnumber + '\'' +
                ", quantity=" + quantity +
                ", category=" + category + '\'' +
                ", warrantyDate=" + warrantyDate + '\'' +
                ", price=" + price +
                '}';
    }
}
