package com.test.helloservice.controller;

import com.test.helloserviceapi.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }

    @RequestMapping(value="/hello2", method = RequestMethod.GET)
    public String hello(@RequestParam  String name){
        return "hello " + name;
    }

    @RequestMapping(value="/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "hello " + user.getName() + ", " + user.getAge();
    }

    @RequestMapping(value="/hello4", method = RequestMethod.GET)
    public String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age){
        return "hello " + name + ", " + age;
    }



}
