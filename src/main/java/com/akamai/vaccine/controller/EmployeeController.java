package com.akamai.vaccine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

   

    @GetMapping("/")
    public String init() {
        return "Hello to vaccine scheduling app ";
    }
}