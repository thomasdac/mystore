package com.example.mystore.repo;

import com.example.mystore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

    List<Product> findAllByNameContaining(String name);

    List<Product> findAllByIdNotNull();
}
