package com.example.demo.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
     @GetMapping("/admin/products")
    public String index () {
        return "admin/pages/product/index";
    }

}
