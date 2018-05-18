package com.example.mystore.controller;

import com.example.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String findAll(Model model) {

        model.addAttribute("products", productService.findAll());
        return "list";
    }

    @PostMapping("/search")
    public String search(@RequestParam String filter, Model model) {

        model.addAttribute("products", productService.findAllByNameContaining(filter));
        return "list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Long id, Model model) {

        model.addAttribute("product", productService.findOne(id));
        return "detail";
    }
}
