package com.example.demo.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class SlideController {

    @GetMapping("/admin/slideshow") // Adjust the mapping based on your needs
    public String index(Model model) {
        List<Slide> slides = Arrays.asList(
                new Slide("Title 1", "../image/img/elements/1.jpg"),
                new Slide("Title 2", "../image/img/elements/2.jpg"),
                new Slide("Title 3", "../image/img/elements/3.jpg"),
                new Slide("Title 4", "../image/img/elements/12.jpg")
        );
        model.addAttribute("slides", slides);
        return "admin/pages/slideshow/index";
    }
}

class Slide {
    private String title;
    private String imageUrl;

    // constructor, getters, and setters
    // Add appropriate getter and setter methods for title and imageUrl

    public Slide(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}