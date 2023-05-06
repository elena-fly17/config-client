package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

    @Value("${greeting}")
    String greeting;

    @GetMapping("/endpoint")
    public String getGreeting(){
        return greeting;
    }
}
