package org.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @RequestMapping("/")
    public String index(){
        return "Hello, Films!";
    }
}
