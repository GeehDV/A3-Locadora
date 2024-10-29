package br.anhembi.locadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.anhembi.locadora.model.Genero;
import br.anhembi.locadora.service.GeneroService;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    private GeneroService service;

    @PostMapping("/{nome}")
    public ResponseEntity<Genero> inserir(@PathVariable String nome){
        Genero genero = service.inserir(nome);
        return ResponseEntity.ok(genero);

        
    }

    
}
