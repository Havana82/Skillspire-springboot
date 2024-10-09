package com.first.spring.Hello_Assign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping(path="/")
    public  String home(){
        return "<h1> Hello Welcome </h2>";

    }

    @GetMapping(path="/greet")
    public  String helloName(){
        return "<h1> Hello Halimat </h2>";

    } @GetMapping(path="/play")
    public  String playTime(){
        return "<h1> Hello Lets Play a Game </h2>";

    } @GetMapping(path="/game")
    public  String game(){
        return "<h1> Our game is super fun </h2>";

    }
}
