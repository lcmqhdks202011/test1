package org.practice.blockingmongo;

import org.practice.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabaseLoader {
//
//
//    @Bean
//    CommandLineRunner initialize(MongoOperations mongo) {
//        return args -> {
//
//            mongo.save(new Item("Alf alarm clock", 19.99));
//            mongo.save(new Item("Smurf TV tray", 24.99));
//
//        };
//    }
}
