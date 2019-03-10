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
    
     public Matriz Multiplicacion(Matriz MS){
        Matriz resultado;
        resultado = new Matriz(MS.rows - 1, this.colums - 1);
        int r1 = 0, r2 = 0;
        while (r1 < this.rows) {
            double sumaT = 0;
            for (int c = 0; c < this.colums; c++){
                sumaT += this.datos[r1][c] * MS.datos[c][r2];
            }
            resultado.datos[r1][r2] = sumaT; 
            if (r2 == MS.colums - 1) {
                r2 = 0;
                r1++;
            }
            else {
                r2++;
            } 
        }
        return(resultado);
    }
     
    public Matriz Inverza(){
        Matriz resultado;
        resultado = new Matriz(this.colums, this.rows);
        for (int r = 0; r < this.rows; r++){
            for (int c = 0; c < this.colums; c++){
                if (r == c) {
                    resultado.datos[r][c] = 1;
                } else {
                    resultado.datos[r][c] = 0;
                }
            }
        }       
        for (int c = 0; c < this.colums; c++){
            double dividendo = this.datos[c][c];
            for (int cc = 0; cc < this.colums; cc++){
                this.datos[c][cc] = this.datos[c][cc] / dividendo;
                resultado.datos[c][cc] = resultado.datos[c][cc] / dividendo;
            }
            for (int r = 0; r < this.rows; r++){
                double mul = this.datos[r][c];
                if (r == c){
                   
                } else {
                    for (int cc = 0; cc < this.colums; cc++){
                        this.datos[r][cc] = this.datos[r][cc] - (this.datos[c][cc] * mul);
                        resultado.datos[r][cc] = resultado.datos[r][cc] - (resultado.datos[c][cc] * mul);
                    }
                }
            }
        }
        return(resultado);
    }
}
