package com.example.mystore;

import com.example.mystore.entity.Product;
import com.example.mystore.repo.ProductRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MystoreApplicationTests {

    @Autowired
    private ProductRepo productRepo;

    private String restURL = "http://localhost:8080/product/by-id/8796093054971";

    @Test
    public void hasLeastFiveRows() {

        Assert.isTrue(productRepo.findAll()
                                 .size() >= 5, "O banco deve ter pelo menos 5 linhas!!!");
    }

    @Test
    public void restByIdReturns() {

        Product product = new RestTemplate().getForObject(restURL, Product.class);

        Assert.isTrue(product != null, "Rest não retornou a URL [" + restURL + "]!");
    }
}
