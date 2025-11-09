package com.proyecto.dam.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.dam.modelos.Juego;
import com.proyecto.dam.repositorios.JuegoRepositorio;

@Service
public class JuegoService {

    private final JuegoRepositorio juegoRepositorio;

    public JuegoService(JuegoRepositorio juegoRepositorio) {
        this.juegoRepositorio = juegoRepositorio;
    }

    public List<Juego> buscar(String filtro) {
        if (filtro == null || filtro.isBlank()) {
            return juegoRepositorio.findAll();
        }
        return juegoRepositorio.buscarPorFiltro(filtro);
    }
}
