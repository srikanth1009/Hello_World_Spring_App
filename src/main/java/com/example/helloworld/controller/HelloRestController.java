package com.example.helloworld.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloRestController {
//    curl localhost:8080/hello -w "\n"
    @RequestMapping("/")
    public  String index(){
        return "Hello From BridgeLabz Using Rest Controller";
    }

}
