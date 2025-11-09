package com.proyecto.dam.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.dam.modelos.Juego;

public interface JuegoRepositorio extends JpaRepository<Juego, Integer> {

    @Query(value = "SELECT * FROM juegos j WHERE " +
            "unaccent(lower(j.name)) LIKE unaccent(lower(concat('%', :filtro, '%'))) OR " +
            "unaccent(lower(j.platform)) LIKE unaccent(lower(concat('%', :filtro, '%'))) OR " +
            "unaccent(lower(j.genre)) LIKE unaccent(lower(concat('%', :filtro, '%'))) OR " +
            "unaccent(lower(j.publisher)) LIKE unaccent(lower(concat('%', :filtro, '%')))", nativeQuery = true)
    List<Juego> buscarPorFiltroNative(String filtro);

}
