package com.Lectura.AppLectura.service;


import com.Lectura.AppLectura.entity.Abecedario;
import com.Lectura.AppLectura.repository.AbecedarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbecedarioService {

    private final AbecedarioRepository repository;

    public AbecedarioService(AbecedarioRepository repository){
        this.repository = repository;
    }

    //Metodo que lista las letras
    public List<Abecedario> listar(){
        return repository.findAll();

    }

    //Metodo que guarda
    public Abecedario guardar(Abecedario letra){
       return repository.save(letra);

    }


    //Metodo que busca las letras
    //Agrege el .orELse por si la busqueda no devuelve nada
    public Abecedario buscar(String letra){
        return repository.findById(letra).orElse(null);
    }

    //Metodo que elimina la letra
    public void eliminar(String letra){
        repository.deleteById(letra);

    }




}
