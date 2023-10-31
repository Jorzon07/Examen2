package com.crud.examen2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {
    @GetMapping
    public String Registro(){
        return  "Registro";
    }
}
