package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="tbl_slideshow")
public class Slideshow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ssid")
    private Long ssid;

    @Column(name="title")
    private String title;
    @Column(name="subtitle")
    private String subtitle;
    @Column(name="text")
    private String text;
    @Column(name="link")
    private String link;
    @Column(name="ssorder")
    private int ssorder;
    @Column(name="enable")
    private String enable;
    @Column(name="img")
    private String img;
    @Column(name="date_modified")
    @UpdateTimestamp
    private LocalDateTime date_modified;
    @Column(name="date_created")
    @CreationTimestamp
    private LocalDateTime date_created;

    public Slideshow() {
    }

    public Long getSsid() {
        return ssid;
    }

    public void setSsid(Long ssid) {
        this.ssid = ssid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getSsorder() {
        return ssorder;
    }

    public void setSsorder(int ssorder) {
        this.ssorder = ssorder;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
