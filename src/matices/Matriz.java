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
    public Matriz(int rows, int colums){
        this.colums = colums;
        this.rows = rows;
        this.datos = new double[rows][colums];
        entDatos = new Scanner(System.in);
    }
    
    public void ingresarDatos(){
        for (int r = 0; r < this.rows; r++){
            for (int c = 0; c < this.colums; c++){
                this.datos[r][c] = entDatos.nextDouble();
            }
        }
    }
    
    public double mostrarDatos(int row, int col){
        return(this.datos[row][col]);
    }
    
    public Matriz Resta(Matriz MS){
        Matriz resultado;
        resultado = new Matriz(this.rows, this.colums);
        for (int r = 0; r < this.rows; r++){
            for (int c = 0; c < this.colums; c++){
                resultado.datos[r][c] = this.datos[r][c] - MS.datos[r][c];
            }
        }
        
        return(resultado);
    }
    
    public Matriz Suma(Matriz MS){
        Matriz resultado;
        resultado = new Matriz(this.rows, this.colums);
        for (int r = 0; r < this.rows; r++){
            for (int c = 0; c < this.colums; c++){
                resultado.datos[r][c] = this.datos[r][c] + MS.datos[r][c];
            }
        }
        return(resultado);
    }
    
    public Matriz Transpuesta(){
        Matriz resultado;
        resultado = new Matriz(this.colums, this.rows);
        for (int r = 0; r < this.rows; r++){
            for (int c = 0; c < this.colums; c++){
                resultado.datos[c][r] = this.datos[r][c];
            }
        }
        return(resultado);
    }
}
