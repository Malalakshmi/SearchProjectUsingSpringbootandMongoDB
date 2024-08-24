package com.lakshmiTech.joblisting1.Repository;

import com.lakshmiTech.joblisting1.Model.PostDetails;

import java.util.List;

public interface SearchRepo {

    List<PostDetails> findByText(String text);
}
