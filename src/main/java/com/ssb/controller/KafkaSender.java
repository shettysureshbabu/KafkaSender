package com.ssb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSender {

    @GetMapping("/hellosender")
    public void HelloSender(){
        System.out.println("Hi...");
    }

}
