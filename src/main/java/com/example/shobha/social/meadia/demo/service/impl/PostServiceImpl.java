package com.example.shobha.social.meadia.demo.service.impl;

import com.example.shobha.social.meadia.demo.service.PostService;
import com.example.shobha.social.meadia.demo.dto.PostDto;
import com.example.shobha.social.meadia.demo.model.PostEntity;
import com.example.shobha.social.meadia.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

   @Autowired
   private PostRepository postRepository;

    @Override
    public List<PostDto> getAllPosts() {

        List<PostEntity>postEntities = postRepository.findAll();
        if(postEntities != null){
            return postEntities.stream().map(postEntity -> mapEntityToDto(postEntity)).collect(Collectors.toList());
        }
        return null;
    }
    private PostDto mapEntityToDto(PostEntity postEntity) {
        PostDto postDto = new PostDto();
        postDto.setId(postEntity.getId());
        postDto.setTitle(postEntity.getTitle());
        postDto.setDescription(postEntity.getDescription());
        postDto.setContent(postEntity.getContent());
        return postDto;

    }

    @Override
    public PostDto getPostById(long id) {
        return null;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        return null;
    }

    @Override
    public PostDto updatePost(PostDto postDto, long postId) {
        return null;
    }

    @Override
    public void deletePostById(long id) {

    }
}
