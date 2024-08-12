package com.springcore.demo.model;

import org.springframework.stereotype.Component;

@Component
public class HotGirl implements IGirl {

    @Override
    public String wear(){
        return "Wearing bikini XD";
    }
}
