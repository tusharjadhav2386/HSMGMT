package com.example.controller;

import com.example.testServices.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DemoController")
public class DemoController {

@Autowired
DemoService demoService;

    @GetMapping("/getDeatils")
    public void getDeatils()
    {
        demoService.getDetails();
    }
}
