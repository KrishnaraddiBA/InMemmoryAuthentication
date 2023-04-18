package com.inMemmoryAuthentication.SpringSecuritySegment1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SpringController {
    @GetMapping("/v2")
    public String getMsg(){
        return "krishnaraddi B A";
    }
}
