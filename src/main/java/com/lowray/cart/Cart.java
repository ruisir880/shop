package com.lowray.cart;

import com.lowray.product.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Ray Rui on 3/28/2017.
 */
@Component
public class Cart {
    private List<Product> shoppingList;
}
