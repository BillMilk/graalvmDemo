package com.example.graalvm.controller;

import com.example.graalvm.service.HeartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartController {

    @Autowired
    private HeartService heartService;

    @RequestMapping("/hello")
    public String hello(){
        return heartService.heart();
    }
}
