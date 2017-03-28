package com.lowray.product;

import com.lowray.property.ProductType;
import com.lowray.property.WareProperty;
import com.lowray.store.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Ray Rui on 3/28/2017.
 */
@Component
public class Ware implements Product {
    private ProductType productType;

    private double price;

    private List<WareProperty> wareProperties;

    @Autowired
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

    public List<WareProperty> getWareProperties() {
        return wareProperties;
    }

    public void setWareProperties(List<WareProperty> wareProperties) {
        this.wareProperties = wareProperties;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
