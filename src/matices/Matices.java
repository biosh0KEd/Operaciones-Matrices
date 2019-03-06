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
                System.out.println("Filas");
                int rowS = entDatos.nextInt();
                System.out.println("Columnas:");
                int columS = entDatos.nextInt();
                Matriz MS1, MS2, MSR;
                MS1 = new Matriz(rowS, columS);
                MS2 = new Matriz(rowS, columS);
                System.out.println("Se ingresan los datos de arriba hacia abajo,\n de izquierda a derecha");
                System.out.println("Ingresa para la Matriz 1:");
                MS1.ingresarDatos();
                System.out.println("Ingresa para la Matriz 2:");
                MS2.ingresarDatos();
                System.out.println("El resultado es:");
                MSR = MS1.Suma(MS2);
                for (int r = 0; r < rowS; r++){
                    System.out.println("");
                    for (int c = 0; c < columS; c++){
                        System.out.print(MSR.mostrarDatos(r, c) + " ");
                    }
                }
            break;
            case 2:
                System.out.println("Resta");
                System.out.println("Ingresa el tamaño de las matrices a restar:");
                System.out.println("Filas");
                int rowR = entDatos.nextInt();
                System.out.println("Columnas:");
                int columR = entDatos.nextInt();
                Matriz MR1, MR2, MRR;
                MR1 = new Matriz(rowR, columR);
                MR2 = new Matriz(rowR, columR);
                System.out.println("Se ingresan los datos de arriba hacia abajo,\n de izquierda a derecha");
                System.out.println("Ingresa para la Matriz 1:");
                MR1.ingresarDatos();
                System.out.println("Ingresa para la Matriz 2:");
                MR2.ingresarDatos();
                System.out.println("El resultado es:");
                MRR = MR1.Resta(MR2);
                for (int r = 0; r < rowR; r++){
                    System.out.println("");
                    for (int c = 0; c < columR; c++){
                        System.out.print(MRR.mostrarDatos(r, c) + " ");
                    }
                }
            break;
            case 3:

            break;
            case 4:
                System.out.println("Transpuesta");
                System.out.println("Ingresa el tamaño de la matriz");
                System.out.println("Filas");
                int rowT = entDatos.nextInt();
                System.out.println("Columnas:");
                int columT = entDatos.nextInt();
                Matriz MT, MTR;
                MT = new Matriz(rowT, columT);
                System.out.println("Se ingresan los datos de arriba hacia abajo,\n de izquierda a derecha");
                System.out.println("Ingresa para la Matriz");
                MT.ingresarDatos();
                System.out.println("El resultado es:");
                MTR = MT.Transpuesta();
                for (int r = 0; r < columT; r++){ 
                    System.out.println("");
                    for (int c = 0; c < rowT; c++){
                        System.out.print(MTR.mostrarDatos(r, c) + " ");
                    }
                }
            break;
            case 5:
            break;
            case 6:
            break;
        }
    }
    
}
