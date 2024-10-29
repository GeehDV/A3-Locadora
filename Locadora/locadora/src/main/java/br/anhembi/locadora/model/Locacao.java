package br.anhembi.locadora.model;

import java.util.Date;
import java.util.ArrayList;

public class Locacao {
    private int id;
    private double valor;
    private Date data;
    private ArrayList<Item> itensLocacao;
    private Cliente cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Item> getItensLocacao() {
        return itensLocacao;
    }

    public void setItensLocacao(ArrayList<Item> itensLocacao) {
        this.itensLocacao = itensLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}