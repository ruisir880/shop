package com.lowray.product;

import com.lowray.property.ProductType;
import com.lowray.store.Store;

/**
 * Created by Ray Rui on 3/28/2017.
 */
public class Ware implements Product {
    private ProductType productType;

    private double price;

    private Store store;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
