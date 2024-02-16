package com.hyperion.testbff;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hola mundo!";
    }


    @GetMapping("/hola")
    public String helloName(@RequestParam("nombre") String nombre) {
        return "Hola, " + nombre + "!";
    }
}
