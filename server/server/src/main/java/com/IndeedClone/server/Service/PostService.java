package com.IndeedClone.server.Service;

import com.IndeedClone.server.DTOs.PostDTO;
import com.IndeedClone.server.Model.Posts;

import java.util.List;

public interface PostService {

    public Posts svaePosts(PostDTO postDTO);

    List<Posts> getAllPost();
}
