package com.kuruvatech.farmify.ui.home;

public class HomeItem {
    private String name;
    private String brand;
    private int imageResourceId;

    public HomeItem(String name, String brand, int imageResourceId) {
        this.name = name;
        this.brand = brand;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }



    // Getter methods for name, brand, and imageResourceId
    // You can generate these using your IDE.
}