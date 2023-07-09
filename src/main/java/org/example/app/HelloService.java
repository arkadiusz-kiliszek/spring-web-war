package org.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloService
{
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello! It's works!";
    }
}
