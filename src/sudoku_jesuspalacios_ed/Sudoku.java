/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku_jesuspalacios_ed;

/**
 *
 * @author user
 */
public class Sudoku {
    
    // Variables privadas de la clase
     public Sudoku()
     {

     }
     public void inicializar()
     {
     }
     @Override
     public String toString()
     {
     String resultadoFinal = "";
     return resultadoFinal;
     }
     public void modificarElemento(int fila, int columna, int elemento) throws
    SudokuException //Da error porque todavia no esta creada la excepcion
     {
         
     }

     public void vaciarElemento(int fila, int columna)
     {

     }
     private boolean comprobarFila(int fila, int elemento)
     {
     boolean resultado = true;
     return resultado;
     }
     private boolean comprobarColumna(int columna, int elemento)
     {
     boolean resultado = true;
     return resultado;
     }
     private boolean comprobarCuadrante(int fila, int columna, int elemento)
     {
     boolean resultado = true;

     return resultado;
     }
     private boolean puedoInsertar(int fila, int columna, int elemento)
     {
     boolean resultado = false;
     return resultado;
     }
}
