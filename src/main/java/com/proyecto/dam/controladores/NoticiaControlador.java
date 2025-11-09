package com.proyecto.dam.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.dam.modelos.Noticia;

@Controller
public class NoticiaControlador {

    @GetMapping("/noticias")
    public String mostrarNoticias(Model model) {

        List<Noticia> noticias = new ArrayList<>();

        noticias.add(new Noticia(
                "Elden Ring anuncia expansión",
                "La esperada expansión de Elden Ring trae nuevos desafíos, jefes y áreas para explorar.",
                "Imagenes/Elden-Ring.jpg",
                "https://www.ign.com/articles/elden-ring-expansion-release-date"
        ));

        noticias.add(new Noticia(
                "God of War: Ragnarok supera expectativas",
                "Los jugadores y críticos elogian la narrativa y el combate del nuevo título de Kratos.",
                "Imagenes/gowr.jpg",
                "https://www.ign.com/articles/god-of-war-ragnarok-review"
        ));

        noticias.add(new Noticia(
                "Minecraft lanza actualización 1.20",
                "Explora nuevas biomas, criaturas y bloques en la última actualización de Minecraft.",
                "Imagenes/minecraft.jpg",
                "https://www.minecraft.net/en-us/article/minecraft-1-20-update"
        ));

        model.addAttribute("noticias", noticias);
        return "noticias"; // Thymeleaf: noticias.html
    }
}
