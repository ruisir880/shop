package com.lowray.cart;

import com.lowray.product.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Ray Rui on 3/29/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAspectJAutoProxy
@ContextConfiguration({"/META-INF/spring-config.xml"})
public class CartTest {

    @Autowired
    private Cart cart;

    @Autowired
    private Product product;

    @Test
    public void testAdd() throws Exception {
        cart.add(product);
    }
}