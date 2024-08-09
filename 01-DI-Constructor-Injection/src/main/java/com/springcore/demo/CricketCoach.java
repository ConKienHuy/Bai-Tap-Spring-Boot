package com.springcore.demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach{

    public String getDailyWorkout() {
        return "Practice for 10 minutes.";
    }
}
