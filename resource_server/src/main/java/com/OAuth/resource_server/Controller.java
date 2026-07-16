package com.OAuth.resource_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/data")
    public String data(){
        return "Hello from Service 2";
    }
}
