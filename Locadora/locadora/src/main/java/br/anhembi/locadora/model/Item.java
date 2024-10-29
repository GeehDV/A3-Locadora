package br.anhembi.locadora.model;

public class Item {
    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private int numeroDias;
    private Genero categoria;
    
    public Item(Genero categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Genero getCategoria() {
        return categoria;
    }

    public void setCategoria(Genero categoria) {
        this.categoria = categoria;
    }
}