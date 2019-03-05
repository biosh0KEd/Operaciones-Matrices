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
