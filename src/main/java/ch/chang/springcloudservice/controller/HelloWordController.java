package ch.chang.springcloudservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello")
    public String hello(){
        return "1"+port;
    }
}
