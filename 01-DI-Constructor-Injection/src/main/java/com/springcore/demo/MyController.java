package com.springcore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    // Khai báo dependency
    private ICoach myCoach;

    // Dependency được inject ở contructor ==>  Constructor injection
    // Spring scan tất cả các class có @Component
    @Autowired
    public MyController(ICoach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/getDailyworkout")
    public String getDailyworkout() {
        return myCoach.getDailyWorkout();
    }
}
