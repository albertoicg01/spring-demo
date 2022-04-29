package com.aicg.demoSpring.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class Controller {

    @GetMapping("/controller")
    public String copyFile(){
        return "Never stop learning!!";
    }
}
