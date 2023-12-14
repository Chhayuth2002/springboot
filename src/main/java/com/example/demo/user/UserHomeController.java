package com.example.demo.user;

import com.example.demo.entity.Slideshow;
import com.example.demo.repo.SlideshowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class UserHomeController {
    @Autowired
    SlideshowRepo slideshowRepo;

    @GetMapping("")
    public String home(Model model){
        List<Slideshow> slideshows = slideshowRepo.findAll();
        model.addAttribute("slideshows", slideshows);
        return "user/index";
    }   
    
}

