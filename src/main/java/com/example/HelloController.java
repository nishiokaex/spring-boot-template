package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, World";
    }

    public static void main(String[] arguments) {
        SpringApplication.run(HelloController.class, arguments);
    }

}