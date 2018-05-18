package com.example.mystore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "P_BASEPRODUCT")
    private Long id;

    @Column(name = "P_VENUE")
    private String name;

    @Column(name = "P_DATE")
    private Date date;
}
