package com.lowray.cart;

import com.lowray.product.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ray Rui on 3/28/2017.
 */
public class Cart {
    private List<Product> shoppingList = new LinkedList<Product>();

    public void add(Product product){
        shoppingList.add(product);
    }
}
