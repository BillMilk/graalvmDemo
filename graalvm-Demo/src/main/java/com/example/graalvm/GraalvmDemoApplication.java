package com.example.graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class GraalvmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraalvmDemoApplication.class, args);
    }

}
