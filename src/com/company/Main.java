package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Pilas pila= new Pilas();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("::::::::::Menú::::::::::");
            System.out.println(" [1] Insertar \n [2] Mostrar \n [3] Buscar \n [4] Eliminar \n [5] Tamaño \n [6] Máximo \n [7] Mínimo \n [8] Terminar ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("inserta un número entero.");
                    pila.Push(sc.nextInt());
                    break;
                case 2:
                    pila.Peek();
                    break;
                case 3:
                    pila.Cima();
                    break;
                case 4:
                    pila.Pop();
                    break;
                case 5:
                    //pila.getTamaño();
                    break;
                case 6:
                   //pila.Maxi_Mini();
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Usted ha salido del programa");
                    break;
                default:
                    System.out.println("Esa opción no es valida");
            }
        }while (opcion!=8);

    }
}
