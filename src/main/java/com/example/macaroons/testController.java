package com.example.macaroons;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class testController {

    public static void main(String[] args) {
        SpringApplication.run(MacaroonsApplication.class, args);
    }
    @GetMapping(value = "/")
    public String aName(){
        return "Login.html";
    }
}
