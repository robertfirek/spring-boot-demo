package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @Autowired
    private NameService nameService;


    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!" + nameService.name() + " \n";
    }
}
