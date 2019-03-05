/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matices;

import java.util.Scanner;
/**
 *
 * @author Efraín
 */
public class Matices {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entDatos;
        entDatos = new Scanner(System.in);
        System.out.println("Operaciones con matrices");
        System.out.println("Escoje una opcion:");
        System.out.println("1:Suma\n2:Resta\n3:Multiplicación\n4:Transpuesta");
        System.out.println("5:Inversa\n6:Determinante");
        int resp = entDatos.nextInt();
        switch(resp) {
            case 1:
                System.out.println("Suma");
                System.out.println("Ingresa el tamaño de las matrices a sumar:");
                System.out.println("Columnas:");
                int columS = entDatos.nextInt();
                System.out.println("Filas");
                int rowS = entDatos.nextInt();
                Matriz M1, M2;
                M1 = new Matriz(columS, rowS);
                M2 = new Matriz(columS, rowS);
                System.out.println("Se ingresan los datos de arriba hacia abajo,\n de izquierda a derecha");
                System.out.println("Ingresa para la Matriz 1:");
                M1.ingresarDatos();
                System.out.println("Ingresa para la Matriz 2:");
                M2.ingresarDatos();
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
        }
    }
    
}
