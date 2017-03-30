package com.lowray.aspect;

import com.lowray.product.Product;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;

/**
 * Created by Ray Rui on 3/29/2017.
 */
public class LogClass {
    private final static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(LogClass.class);

    public void addProduct(JoinPoint joinPoint){
       // LOGGER.info("add product {} into cart {}",product.toString(),cart.toString());
        Product product = (Product)joinPoint.getArgs()[0];
        LOGGER.info("add product {} into cart,price: {}",product.getProductType(),product.getPrice());
    }

}
