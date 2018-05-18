package com.example.mystore.rest;

import com.example.mystore.entity.Product;
import com.example.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRest {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public List<Product> list(){

        return  productService.findAll();
    }

    @GetMapping("/by-id/{id}")
    public Product byId(@PathVariable Long id){

        return  productService.findOne(id);
    }

}
