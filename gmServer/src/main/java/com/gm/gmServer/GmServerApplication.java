package com.gm.gmServer;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GmServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmServerApplication.class, args);
	}

}
