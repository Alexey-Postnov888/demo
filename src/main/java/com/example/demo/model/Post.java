package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate, Integer likes){
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public String getText(){
        return this.text;
    }

    public Integer getLikes(){
        return this.likes;
    }

    public Date getCreationDate(){
        return this.creationDate;
    }

    public Long getId(){
        return this.id;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }
}
