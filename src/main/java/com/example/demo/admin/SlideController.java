package com.example.demo.admin;

import com.example.demo.entity.Slideshow;
import com.example.demo.repo.SlideshowRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/admin/slideshow")
public class SlideController {
    @Autowired
    SlideshowRepo slideshowRepo;

    @GetMapping
    public String getAllSlide(Model model){
        List<Slideshow> slideshows = slideshowRepo.findAll();
        model.addAttribute("slideshows", slideshows);
        model.addAttribute("page","slideshow");
        return "admin/pages/slideshow/index";
    }

    @GetMapping("/insert")
    public String Insert(Model model) {
        model.addAttribute("page","slideshow/insert");
        return "admin/pages/slideshow/insert";
    }
    
}