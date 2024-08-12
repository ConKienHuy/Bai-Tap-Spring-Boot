package com.springcore.demo.model;

import org.springframework.stereotype.Component;

@Component
public class SchoolGirl implements IGirl {

    @Override
    public String wear(){
        return "Wearing School Uniform";
    }
}
