package com.example.mystore.service;

import com.example.mystore.entity.Product;
import com.example.mystore.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> findAll() {

        return productRepo.findAllByIdNotNull();
    }

    public List<Product> findAllByNameContaining(String name) {

        return productRepo.findAllByNameContaining(name);
    }

    public Product findOne(Long id) {

        return productRepo.findOne(id);
    }
}
