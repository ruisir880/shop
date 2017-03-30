package com.lowray.store;

import com.lowray.product.Product;
import com.lowray.user.User;

import java.io.Serializable;

/**
 * Created by Ray Rui on 3/28/2017.
 */
public interface Store extends Serializable {

    void addToStore(Product product);

    User getMerchant();


}
