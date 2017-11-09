package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pilas p = new Pilas();
        p.Push(2);
        p.Push(99);
        p.Push(1);
<<<<<<< HEAD
        p.Push(8);
        p.Push(32);

        p.Peek();
        p.Maxi_Mini();
=======
        p.Peek();
        System.out.println("El tamaño es: "+p.getTamaño());
>>>>>>> colaborador_2
        p.Cima();
        p.Pop();
        p.Peek();
        System.out.println("El tamaño es: "+p.getTamaño());
        p.Pop();
        p.Cima();
        p.Pop();
        p.Peek();
        System.out.print("El tamaño es: "+p.getTamaño());
    }
}
