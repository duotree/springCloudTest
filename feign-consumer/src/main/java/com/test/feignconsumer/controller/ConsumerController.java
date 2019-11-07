package com.test.feignconsumer.controller;

import com.test.feignconsumer.service.HelloService;
import com.test.feignconsumer.service.RefactorHelloService;
import com.test.helloserviceapi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

   /* @Autowired
    HelloService helloService;*/

    @Autowired
    RefactorHelloService refactorHelloService;

//    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
//    public String helloConsumer(){
//       return  helloService.hello();
//    }

//    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
//    public String helloConsumer2(){
//        StringBuilder sb = new StringBuilder();
//        sb.append(helloService.hello("hello with name")).append("\n");
//        sb.append(helloService.hello("hello with name and age", 25)).append("\n");
//        sb.append(helloService.hello(new User("hello with user", 25))).append("\n");
//        return sb.toString();
//    }

    @RequestMapping(value="/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("refactor with name")).append("\n");
       // sb.append(refactorHelloService.hello("refactor with name and age", 25)).append("\n");
        sb.append(refactorHelloService.hello(new com.test.helloserviceapi.dto.User("refactor with user", 26))).append("\n");
        return sb.toString();
    }
}
