package com.springcore.demo.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach{

    @Override
    public String getDailyWorkout() {
        return "Cricket Coach said: Pratice for 10 mintes.";
    }
}
