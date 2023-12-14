package com.example.demo.repo;

import com.example.demo.entity.Slideshow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlideshowRepo extends JpaRepository<Slideshow, Long> {
    
}