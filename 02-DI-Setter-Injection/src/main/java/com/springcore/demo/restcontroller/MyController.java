package com.springcore.demo.restcontroller;

import com.springcore.demo.model.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private ICoach myCoach;

    @Autowired
    public void setmyCoach(ICoach coach) {
        this.myCoach = coach;
    } // Setter Injection

    @GetMapping({"/", "/myCoach1"})
    public String getDailyworkout(){
        return myCoach.getDailyWorkout();
    }


}
