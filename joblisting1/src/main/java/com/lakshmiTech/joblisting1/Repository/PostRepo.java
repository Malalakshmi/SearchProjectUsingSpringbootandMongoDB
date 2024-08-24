package com.lakshmiTech.joblisting1.Repository;

import com.lakshmiTech.joblisting1.Model.PostDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends MongoRepository<PostDetails, String> {
}
