package com.lakshmiTech.joblisting1.Controller;

import com.lakshmiTech.joblisting1.Model.PostDetails;
import com.lakshmiTech.joblisting1.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/getallposts")
    public List<PostDetails> getalldetails(){
        return postService.getalldetails();
    }

    @PostMapping("/addpost")
    public void addPost(@RequestBody PostDetails post){
        postService.addPost(post);
    }

    @GetMapping("/postbytext/{text}")
    public List<PostDetails> getPostByText(@PathVariable("text") String text){
        return postService.findByText(text);

    }
}
