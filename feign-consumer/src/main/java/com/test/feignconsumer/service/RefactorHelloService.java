package com.test.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "hello-service")
public interface RefactorHelloService extends HelloService {

}
