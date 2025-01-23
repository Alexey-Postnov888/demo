package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        Post postFirst = new Post("Post 1", new Date());
        Post postSecond = new Post("Post 2", new Date());
        Post postThird = new Post("Post 3", new Date());

        return new ArrayList<>(Arrays.asList(postFirst, postSecond, postThird));
    }
}
