package br.anhembi.locadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.anhembi.locadora.model.Genero;
import br.anhembi.locadora.repository.GeneroRepo;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepo repo;

    public Genero inserir(String nome){
        Genero genero = new Genero();
        genero.setNome(nome);

        return repo.save(genero);

    }

    
}