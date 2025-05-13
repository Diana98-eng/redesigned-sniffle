package com.politenico.programaciondos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController  
public class inicio {
    @GetMapping("/")
    public String inicio() {
        return " hola mundo  "  +  " desde spring boot ";
    }
}
