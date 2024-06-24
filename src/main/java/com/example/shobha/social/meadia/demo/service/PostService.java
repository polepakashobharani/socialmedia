package com.example.shobha.social.meadia.demo.service;

import com.example.shobha.social.meadia.demo.dto.PostDto;

import java.util.List;

public interface PostService {

    List<PostDto> getAllPosts();
    PostDto getPostById(long id);

    PostDto createPost(PostDto postDto);

    PostDto updatePost(PostDto postDto, long postId);

    void deletePostById(long id);



}
