package br.anhembi.locadora.model;

import java.util.List;

// Classe que representa um filme
public class Filme {
    private int id;
    private String titulo;
    private Genero genero;
    private String sinopse;
    private int anoLancamento;
    private double classicacao;
    private List<Ator> atores;

    public Filme (){

    }

// Métodos para buscar e exibir informações detalhadas de um filme
public Filme(int id, String titulo, Genero genero, String sinopse, int anoLancamento, double classicacao, List<Ator> atores) {
    this.id = id;
    this.titulo = titulo;
    this.genero = genero;
    this.sinopse = sinopse;
    this.anoLancamento = anoLancamento;
    this.classicacao = classicacao;
    this.atores = atores;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public Genero getGenero() {
    return genero;
}

public void setGenero(Genero genero) {
    this.genero = genero;
}

public String getSinopse() {
    return sinopse;
}

public void setSinopse(String sinopse) {
    this.sinopse = sinopse;
}

public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
}

public double getClassicacao() {
    return classicacao;
}

public void setClassicacao(double classicacao) {
    this.classicacao = classicacao;
}

public List<Ator> getAtores() {
    return atores;
}

public void setAtores(List<Ator> atores) {
    this.atores = atores;
}

public String getInfo() {
    return titulo + "(" + anoLancamento + ")\n" + sinopse + "\nClassificação: " + classicacao;
    }

public String getTitulo() {
    return titulo;
}

public int getAnoLancamento() {
    return anoLancamento;
}
}

