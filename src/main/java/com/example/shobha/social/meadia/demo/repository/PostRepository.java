package com.example.shobha.social.meadia.demo.repository;

import com.example.shobha.social.meadia.demo.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long>   {
}
