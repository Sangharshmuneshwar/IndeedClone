package com.IndeedClone.server.Controller;
import com.IndeedClone.server.DTOs.PostDTO;
import com.IndeedClone.server.Model.Posts;
import com.IndeedClone.server.Service.PostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/Posts")
    public Posts svaePosts(@Valid @RequestBody PostDTO postDTO){

       return postService.svaePosts(postDTO);
    }

    @GetMapping("/AllPosts")
    public List<Posts> getAllPost(){

        return postService.getAllPost();
    }
}
