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
public class Matriz {
    private Scanner entDatos;
    private int colums;
    private int rows;
    private double[][] datos;
    public Matriz(int colums, int rows){
        this.colums = colums;
        this.rows = rows;
        this.datos = new double[colums][rows];
        entDatos = new Scanner(System.in);
    }
    
    public void ingresarDatos(){
        for (int c = 0; c < this.colums; c++){
            for (int r = 0; r < this.rows; r++){
                this.datos[c][r] = entDatos.nextDouble();
            }
        }
    }
    
    public double mostrarDatos(int col, int row){
        return(this.datos[col][row]);
    }
    
    public Matriz Resta(Matriz MS){
        Matriz resultado;
        resultado = new Matriz(this.colums, this.rows);
        for (int c = 0; c < this.colums; c++){
            for (int r = 0; r < this.rows; r++){
                resultado.datos[c][r] = this.datos[c][r] - MS.datos[c][r];
            }
        }
        return(resultado);
    }
    
    public Matriz Suma(Matriz MS){
        Matriz resultado;
        resultado = new Matriz(this.colums, this.rows);
        for (int c = 0; c < this.colums; c++){
            for (int r = 0; r < this.rows; r++){
                resultado.datos[c][r] = this.datos[c][r] + MS.datos[c][r];
            }
        }
        return(resultado);
    }
}
