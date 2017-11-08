package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pilas p = new Pilas();
        p.Push(2);
        p.Push(8);
        p.Push(1);

        p.Peek();
        p.Cima();
        p.Pop();
        p.Peek();
        p.Pop();
        p.Cima();
        p.Pop();
        p.Peek();
    }
}
