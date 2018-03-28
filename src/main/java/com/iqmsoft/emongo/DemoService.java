package com.iqmsoft.emongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
    private MongoTemplate mongoTemplate;

    @Autowired
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public String getDbName() {
        return mongoTemplate.getDb().getName();
    }

    public void save(Demo sample) {
        mongoTemplate.save(sample);
    }

    public Demo get(Object id) {
        return mongoTemplate.findById(id, Demo.class);
    }
}
