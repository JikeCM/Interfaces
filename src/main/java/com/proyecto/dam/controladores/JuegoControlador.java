package com.proyecto.dam.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.dam.servicio.JuegoService;

@Controller
public class JuegoControlador {

    private final JuegoService juegoService;

    public JuegoControlador(JuegoService juegoService) {
        this.juegoService = juegoService;
    }

    @GetMapping("/buscador")
    public String buscador(@RequestParam(required = false) String filtro, Model model) {
        model.addAttribute("juegos", juegoService.buscar(filtro));
        model.addAttribute("filtro", filtro);
        return "buscador"; // buscador.html
    }

    @GetMapping("/juego/{rank}")
    public String detalleJuego(@org.springframework.web.bind.annotation.PathVariable Integer rank, Model model) {
        var juego = juegoService.buscarPorRank(rank);
        model.addAttribute("juego", juego);
        return "detalle"; // nombre del HTML que mostrarás
    }
}
