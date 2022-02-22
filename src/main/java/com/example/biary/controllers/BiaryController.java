package com.example.biary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BiaryController {

    @GetMapping("/BinToDeci")
    public String binToDeci(){
        return "BinToDeci";
    }

}
