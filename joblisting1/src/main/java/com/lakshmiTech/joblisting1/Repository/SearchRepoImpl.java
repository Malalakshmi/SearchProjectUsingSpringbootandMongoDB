package com.lakshmiTech.joblisting1.Repository;

import ch.qos.logback.core.pattern.ConverterUtil;
import com.lakshmiTech.joblisting1.Model.PostDetails;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.json.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchRepoImpl implements SearchRepo{

    @Autowired
    MongoClient mongoClient;

    @Autowired
    MongoConverter mongoConverter;

    @Override
    public List<PostDetails> findByText(String text) {
        List<PostDetails> posts = new ArrayList<>();

        MongoDatabase database = mongoClient.getDatabase("LakshmiTech");
        MongoCollection<Document> collection = database.getCollection("jobpost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", Arrays.asList("techs", "profile")))),
                new Document("$sort",
                        new Document("exp", -1L))));

        result.forEach(doc -> posts.add(mongoConverter.read(PostDetails.class, doc)));
        return posts;
    }
}
