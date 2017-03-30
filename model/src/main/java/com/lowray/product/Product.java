package com.lowray.product;

import com.lowray.property.ProductType;
import com.lowray.store.Store;

import java.io.Serializable;

/**
 * Created by Ray Rui on 3/28/2017.
 */
public interface Product extends Serializable{
    ProductType getProductType();

    double getPrice();

    Store getStore();
}
