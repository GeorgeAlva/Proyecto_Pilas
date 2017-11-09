package com.company;

import javax.xml.soap.SOAPPart;

/**
 * Created by George on 08/11/2017.
 */
public class Pilas {
    private Nodo top;

    public Pilas() {
        top = null;
    }

    public boolean Vacia(){
        return (top==null);
    }
    //Método para insertar
    public void Push (int Valor){
        Nodo NuevoNodo;
        if(Vacia()){
            top= new Nodo(Valor);
        }else{
            NuevoNodo=new Nodo(Valor);
            NuevoNodo.setProx(top);
            top = NuevoNodo;
        }
    }
    //Método para buscar
    public  void Peek(){
        Nodo temp =top;
        if (temp != null){
            System.out.println("La pila es : ");
            while (temp != null){
                System.out.println(temp.getValor());
                temp = temp.getProx();
            }
        }else{
            System.out.println("La pila esta vacía");
        }
    }
    //Método para bucar
    public  void Cima(){
        if (!Vacia()){
            System.out.println("Cima: " + top.getValor());
        }else{
            System.out.println("La pila eta vacía");
        }
    }
    //Métod para borrar
    public void Pop(){
    if (!Vacia()){
        System.out.println("Dato extraido: " + top.getValor());
        top = top.getProx();
    }else {
        System.out.println("La pila esta vacía");
    }
    }


}
