package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;

//import java.util.Arrays;

@Component
@SpringBootApplication
public class Demo3Application implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Demo3Application.class);
    @Autowired
    private Environment env;
    @Override
    public void run(String... args) throws Exception {
        String URL = env.getProperty("MYSQL_DB_HOST");
        logger.info("MySQL database url is: {}", URL);
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }
}
