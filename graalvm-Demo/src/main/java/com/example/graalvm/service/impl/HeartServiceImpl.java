package com.example.graalvm.service.impl;

import com.example.graalvm.service.HeartService;

public class HeartServiceImpl implements HeartService {
    @Override
    public String heart() {
        return "ok";
    }
}
