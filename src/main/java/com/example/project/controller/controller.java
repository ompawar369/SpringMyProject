package com.example.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/noo")
    public void controller1() {
        System.out.println("I am sorry");
    }

    @GetMapping("/students/{rollNo}")
    public String getStudent(@PathVariable("rollNo") String rollNo) {
        System.out.println(rollNo);
        return rollNo;

    }
}
