package com.company;

/**
 * Created by George on 08/11/2017.
 */
public class Nodo {
    private int valor;
    private Nodo prox;
    //Constructores
    public Nodo() {
        this.valor = 0;
        this.prox = null;
    }
    public Nodo(int valor) {
        this.valor = valor;
        this.prox = null;
    }
    //Métodos setters and getters
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getProx() {
        return prox;
    }
    public void setProx(Nodo prox) {
        this.prox = prox;
    }
}
