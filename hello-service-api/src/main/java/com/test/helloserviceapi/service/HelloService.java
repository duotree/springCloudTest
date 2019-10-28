package com.test.helloserviceapi.service;

import com.test.helloserviceapi.dto.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/refactor")
public interface HelloService {


    @RequestMapping(value="/hello5", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value="/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);

    @RequestMapping(value="/hello7", method = RequestMethod.GET)
    String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
}
