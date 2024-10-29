package br.anhembi.locadora.repository;

import org.springframework.data.repository.CrudRepository;

import br.anhembi.locadora.model.Genero;

public interface GeneroRepo extends CrudRepository <Genero, Integer> {
    
}
