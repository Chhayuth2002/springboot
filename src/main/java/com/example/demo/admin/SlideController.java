package com.example.demo.admin;

import com.example.demo.entity.Slideshow;
import com.example.demo.repo.SlideshowRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SlideController {
    @Autowired
    SlideshowRepo slideshowRepo;

    @GetMapping("admin/slideshow")
    public String slideshow(Model model){
        List<Slideshow> slideshows = slideshowRepo.findAll();
        model.addAttribute("slideshows", slideshows);
        model.addAttribute("page","slideshow");
        return "admin/pages/slideshow/index";
    }

    @GetMapping("admin/slideshow/insert")
    public String Insert(Model model) {
        return "admin/pages/slideshow/insert";
    }
    
}