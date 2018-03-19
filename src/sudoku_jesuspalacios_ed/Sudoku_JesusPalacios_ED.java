/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku_jesuspalacios_ed;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sudoku_JesusPalacios_ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un Scanner para leer por teclado
        Scanner teclado = new Scanner(System.in);
         //Creamos las variables necesarias
          int[][] sudoku = new int[9][9];
            int fila = 0;
            int columna = 0;
            int elemento = 0;
            
            //Pedimos que introduzca posicion y elemento
                System.out.println("Introduce fila:");
                fila = teclado.nextInt();
                System.out.println("Introduce columna:");
                columna= teclado.nextInt();
                System.out.println("Introduce el elemento:");
                elemento= teclado.nextInt();
                
             //Aquí deberíamos llamar a los métodos de la clase, no los llamo porque no funcionan y no está completa la clase(Falta vaciarElemento y modificarElemento)
    }
    
}
