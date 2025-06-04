package com.example.graalvm.config;

import com.example.graalvm.service.HeartService;
import com.example.graalvm.service.impl.HeartServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class Config {

    @Bean
    public HeartService heartService() {
        return new HeartServiceImpl();
    }
}
