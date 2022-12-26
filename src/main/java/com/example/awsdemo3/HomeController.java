package com.example.awsdemo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/message")
    public String home(){
        return "home";
    }
}
