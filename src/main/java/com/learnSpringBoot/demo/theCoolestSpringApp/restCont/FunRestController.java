package com.learnSpringBoot.demo.theCoolestSpringApp.restCont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/tacocat")
    public String sayHi(){
        return "Hello the time now is: " + LocalDateTime.now() + "bruh!";
    }

    //expose a new endpoint for app
    @GetMapping("/singing")
    public String singBruh(){
        return "LALALALAAL";
    }
}
