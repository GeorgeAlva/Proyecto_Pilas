package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("::::::::::Menú::::::::::");
            System.out.println(" [1] Insertar \n [2] Mostrar \n [3] Buscar \n [4] Eliminar \n [5] Tamaño \n [6] Máximo \n [7] Mínimo \n [8] Terminar ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
