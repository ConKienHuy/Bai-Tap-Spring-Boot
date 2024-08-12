package com.springcore.demo.rest;

import com.springcore.demo.model.IGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private IGirl myGirl;

    @Autowired
    public MyController(@Qualifier("hotGirl") IGirl girl) {
        myGirl = girl;
    }

    @GetMapping("/")
    public String whatUwearing(){
        return myGirl.wear();
    } // Output: Wearing bikini XD
}
