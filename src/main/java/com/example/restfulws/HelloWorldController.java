package com.example.restfulws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public String getGreetingMessage() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean getBeanContent() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/{name}")
    public String getGreetingMessageWithParam(@PathVariable String name) {
        return String.format("Hello World, %s", name);
    }
}
