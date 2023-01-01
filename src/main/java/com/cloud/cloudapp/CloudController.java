package com.cloud.cloudapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CloudController {
    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public List<String> helloWorld() {
        return List.of("Hello World!!!");
    }
}
