package com.lowray.store;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.lowray.product.Product;
import com.lowray.property.ProductType;
import com.lowray.user.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ray Rui on 3/28/2017.
 */
public class WareStore implements Store {

    private Cache<ProductType,List<Product>> productCache = CacheBuilder.newBuilder().softValues().build();

    private User merchant;

    public void addToStore(Product product) {
        List<Product> products = productCache.getIfPresent(product.getProductType());
        if(products !=null) {
            products.add(product);
        }else {
            LinkedList<Product> productList = new LinkedList<Product>();
            productList.add(product);
            productCache.put(product.getProductType(),productList);
        }

    }

    public User getMerchant() {
        return merchant;
    }

    public void setMerchant(User merchant) {
        this.merchant = merchant;
    }
}
