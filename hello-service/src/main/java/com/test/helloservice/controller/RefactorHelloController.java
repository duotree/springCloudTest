package com.test.helloservice.controller;

import com.test.helloserviceapi.dto.User;
import com.test.helloserviceapi.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorHelloController implements HelloService{
    @Override
    public String hello(String name) {
        return name;
    }

    @Override
    public String hello(User user) {
        return user.getName() + ", " + user.getAge();
    }

    @Override
    public String hello(String name, Integer age) {
        return name + "," + age;
    }
}
