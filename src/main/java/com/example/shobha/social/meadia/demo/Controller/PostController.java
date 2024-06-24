package com.example.shobha.social.meadia.demo.Controller;


import com.example.shobha.social.meadia.demo.dto.PostDto;
import com.example.shobha.social.meadia.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/posts")


public class PostController {

   @Autowired
   private PostService postService;

   @GetMapping
    public List<PostDto>getAllPosts(){
       return postService.getAllPosts();
   }


}
