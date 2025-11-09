package com.proyecto.dam.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.dam.modelos.Juego;

public interface JuegoRepositorio extends JpaRepository<Juego, Integer> {

@Query(value = "SELECT * FROM juego j WHERE " +
               "LOWER(j.name) LIKE LOWER(CONCAT('%', :filtro, '%')) OR " +
               "LOWER(j.platform) LIKE LOWER(CONCAT('%', :filtro, '%')) OR " +
               "LOWER(j.genre) LIKE LOWER(CONCAT('%', :filtro, '%')) OR " +
               "LOWER(j.publisher) LIKE LOWER(CONCAT('%', :filtro, '%')) OR " +
               "CAST(j.rank AS CHAR) LIKE CONCAT('%', :filtro, '%')", nativeQuery = true)
List<Juego> buscarPorFiltro(String filtro);
}
