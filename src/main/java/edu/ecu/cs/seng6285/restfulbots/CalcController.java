package edu.ecu.cs.seng6285.restfulbots;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/add")
    private int add(int n, int m){
        return n + m;
    }
}
