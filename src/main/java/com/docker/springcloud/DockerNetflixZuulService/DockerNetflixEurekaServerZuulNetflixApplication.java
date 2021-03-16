package com.docker.springcloud.DockerNetflixZuulService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DockerNetflixEurekaServerZuulNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerNetflixEurekaServerZuulNetflixApplication.class, args);
	}

}
