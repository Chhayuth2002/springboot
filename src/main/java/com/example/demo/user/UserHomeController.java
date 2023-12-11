package com.example.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserHomeController {
    @GetMapping("/")
    public String index () {
        return "user/index";
    }
    
}

