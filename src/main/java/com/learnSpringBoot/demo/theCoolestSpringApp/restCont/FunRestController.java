package com.learnSpringBoot.demo.theCoolestSpringApp.restCont;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // Retrieve custom properties
    @Value("${developer.name}")
    private String devName;
    @Value("${developer.expertiseLevel}")
    private String lvlPower;
    @Value("${developer.attidude}")
    private String atttidude;
    @Value("${developer.fuel}")
    private String fuel;

    @GetMapping("/customProps")
    public String showMemyProperties(){
        return "The developer for this project is : " + devName + "\n"
                + "He has a power level of over : " + lvlPower + "\n"
                + "And he is fueled by: " + fuel;
    }

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
