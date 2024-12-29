package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("Eder", "eder@email.com", "999999", "123eder123");
        User u2 = new User("Eder2", "eder2@email.com", "888888", "123eder123");

        // Salvando os usuários no repositório
        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
