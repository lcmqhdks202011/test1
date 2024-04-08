package org.practice.blockingmongo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.client.MongoClient;

@Configuration
public class MongoConfig {
//
//    @Autowired
//    private MongoClient mongoClient;
//
//
//    @Bean
//    public MongoOperations mongoTemplate() {
//        return new MongoTemplate(mongoClient, "mydb");
//    }
}
