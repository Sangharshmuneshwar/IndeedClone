package com.IndeedClone.server.Service.Impl;

import com.IndeedClone.server.DTOs.PostDTO;
import com.IndeedClone.server.Model.Posts;
import com.IndeedClone.server.Repository.PostRepository;
import com.IndeedClone.server.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;
    @Override
    public Posts svaePosts(PostDTO postDTO) {

        Posts posts = new Posts();
        posts.setDescription(postDTO.getDescription());
        posts.setSalary(postDTO.getSalary());
        posts.setProfile(postDTO.getProfile());
        posts.setType(postDTO.getType());
        posts.setTechnology(postDTO.getTechnology());
        posts.setExperience(postDTO.getExperience());

        return postRepository.save(posts);
    }

    @Override
    public List<Posts> getAllPost() {
         return postRepository.findAll();

    }
}
