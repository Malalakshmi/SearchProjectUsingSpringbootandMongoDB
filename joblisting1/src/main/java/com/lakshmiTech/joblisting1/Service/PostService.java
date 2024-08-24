package com.lakshmiTech.joblisting1.Service;

import com.lakshmiTech.joblisting1.Model.PostDetails;
import com.lakshmiTech.joblisting1.Repository.PostRepo;
import com.lakshmiTech.joblisting1.Repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    @Autowired
    SearchRepo searchRepo;

    public List<PostDetails> getalldetails() {
        return postRepo.findAll();
    }

    public void addPost(PostDetails post) {
      postRepo.save(post);
    }

    public List<PostDetails> findByText(String text) {
        return searchRepo.findByText(text);
    }
}
