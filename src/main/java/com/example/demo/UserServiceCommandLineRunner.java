package com.example.demo;

import com.example.demo.Models.User;
import com.example.demo.Services.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserServiceCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack");
        userRepository.save(user);
        log.info("New user is " + user);
    }
}
