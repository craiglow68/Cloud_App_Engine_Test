package edu.ecu.cs.seng6285.restfulbots;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/add")
    private int add(int n, int m){
        return n + m;
    }

    @GetMapping("/subtract")
    private int subtract(int n, int m){
        return n - m;
    }

    @GetMapping("/times")
    private int times(int n, int m){
        return n * m;
    }

    @GetMapping("/div")
    private int div(int n, int m){
        return n / m;
    }

    @GetMapping("/neg")
    private int add(int n){
        return n * -1;
    }
}
