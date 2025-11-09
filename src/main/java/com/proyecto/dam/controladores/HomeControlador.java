package com.proyecto.dam.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlador {

    @GetMapping("/")
    public String inicio() {
        return "inicio"; // templates/inicio.html
    }

}