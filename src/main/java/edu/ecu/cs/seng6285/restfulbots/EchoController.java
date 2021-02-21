package edu.ecu.cs.seng6285.restfulbots;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo")
    private String echo(String word1, String word2, String word3){
        return String.format("%s %s %s", word1, word2, word3);
    }
}
