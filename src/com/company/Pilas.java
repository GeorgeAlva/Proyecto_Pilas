package com.company;

import javax.xml.soap.SOAPPart;
import java.nio.charset.MalformedInputException;

/**
 * Created by George on 08/11/2017.
 */
public class Pilas {
    private Nodo top;

    public Pilas() {
        top = null;
    }

    public boolean Vacia() {
        return (top == null);
    }

    //Método para insertar
    public void Push(int Valor) {
        Nodo NuevoNodo;
        if (Vacia()) {
            top = new Nodo(Valor);
        } else {
            NuevoNodo = new Nodo(Valor);
            NuevoNodo.setProx(top);
            top = NuevoNodo;
        }
    }

    //Método para buscar
    public void Peek() {
        Nodo temp = top;
        if (temp != null) {
            System.out.println("La pila es : ");
            while (temp != null) {
                System.out.println(temp.getValor());
                temp = temp.getProx();
            }
        } else {
            System.out.println("La pila esta vacia");
        }
    }

    //Método para bucar
    public void Cima() {
        if (!Vacia()) {
            System.out.println("Cima: " + top.getValor());
        } else {
            System.out.println("La pila eta vacia");
        }
    }

    //Métod para borrar
    public void Pop() {
        if (!Vacia()) {
            System.out.println("Dato extraido: " + top.getValor());
            top = top.getProx();
        } else {
            System.out.println("La piula esta vacia");
        }
    }

    public void Maxi_Mini() {
        Nodo temp = top;
        int Max = temp.getValor();
        int Min = temp.getProx().getValor();
        if (temp != null) {
            while (temp != null) {
                if (Max < temp.getValor()) {
                    Max = temp.getValor();
                }
                if (Min > temp.getValor()) {
                    Min = temp.getValor();
                }
                temp = temp.getProx();
            }
            System.out.println("El valor máximo es: " + Max);
            System.out.println("El valor mínimo es: " + Min);

        } else {
            System.out.println("La pila esta vacia");

        }
    }
}
