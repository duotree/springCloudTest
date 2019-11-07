package com.test.feignconsumer.service;

import com.test.helloserviceapi.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

//@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping(value="/hello")
    String hello();

    @RequestMapping(value="/hello2", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value="/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);

    @RequestMapping(value="/hello4", method = RequestMethod.GET)
    String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
}
