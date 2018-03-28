package com.iqmsoft.emongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootMongoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoApplication.class, args);
    }

    private DemoService demoService;

    @Autowired
    public void setSampleService(DemoService sampleService) {
        this.demoService = sampleService;
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info(demoService.getDbName());

        Demo sample = new Demo(1L, "Demo #1");
        demoService.save(sample);

        LOGGER.info(sample.toString());

        Demo sample1 = demoService.get(1);
        LOGGER.info(sample1.toString());
    }
}
