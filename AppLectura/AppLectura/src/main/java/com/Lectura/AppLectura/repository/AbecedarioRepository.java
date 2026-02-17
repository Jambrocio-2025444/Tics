package com.Lectura.AppLectura.repository;

import com.Lectura.AppLectura.entity.Abecedario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbecedarioRepository extends JpaRepository<Abecedario,String> {
    String letra(String letra);
}
