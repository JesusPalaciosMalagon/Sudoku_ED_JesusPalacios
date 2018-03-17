/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku_jesuspalacios_ed;

/**
 *
 * @author Jesus Palacios Malagón
 */
public class Sudoku {
    
    // Variables privadas de la clase
     public Sudoku()
     {
            
     }
     public void inicializar()
     {
         int[][] matriz = new int[9][9];
         int matrizSudoku = 1;
         
   
        switch (matrizSudoku){
   
            case 2:

            matriz[0][0] = 7;matriz[0][4] = 5;matriz[0][6] = 4;matriz[1][0] = 4;
            matriz[1][3] = 1;matriz[1][4] = 9;matriz[1][6] = 6;matriz[1][7] = 2;
            matriz[1][8] = 7;matriz[2][2] = 6;matriz[2][8] = 9;matriz[3][0] = 9;
            matriz[3][2] = 3;matriz[3][6] = 8;matriz[4][3] = 4;matriz[4][5] = 3;
            matriz[5][2] = 8;matriz[5][6] = 5;matriz[5][8] = 2;matriz[6][0] = 5;
            matriz[6][6] = 2;matriz[7][0] = 2;matriz[7][1] = 9;matriz[7][2] = 1;
            matriz[7][4] = 4;matriz[7][5] = 7;matriz[7][8] = 8;matriz[8][2] = 7;
            matriz[8][4] = 1;matriz[8][8] = 5;

            break;


            case 1:
            default:

            matriz[0][2] = 9;matriz[0][5] = 8;matriz[0][6] = 5; matriz[0][7] = 4;
            matriz[1][8] = 7;matriz[2][1] = 5;matriz[2][2] = 4; matriz[2][4] = 9;
            matriz[2][6] = 1;matriz[3][5] = 6;matriz[3][6] = 3; matriz[3][7] = 2;
            matriz[4][1] = 8;matriz[4][2] = 2;matriz[4][6] = 4; matriz[4][7] = 1;
            matriz[5][1] = 3;matriz[5][2] = 5;matriz[5][3] = 2; matriz[6][2] = 7;
            matriz[6][4] = 3;matriz[6][6] = 2;matriz[6][7] = 5; matriz[7][0] = 9;
            matriz[8][1] = 4;matriz[8][2] = 3;matriz[8][3] = 8; matriz[8][7] = 9;

            break;

            }

            
           }
     
     @Override
     public String toString()
     {
     String resultadoFinal = "";
     return resultadoFinal;
     }
     public void modificarElemento(int fila, int columna, int elemento) throws
    SudokuException 
     {
         
     }

     public void vaciarElemento(int fila, int columna)
     {

     }
     private boolean comprobarFila(int fila, int elemento, int[][] matriz)
     {
     boolean resultado = false;
         int numero = 0;
     for ( int i = 0; i < matriz.length; i ++ )
        if ( matriz[(fila-1)][i] == numero ){
         resultado = true;
        }
     return resultado;
     }
     
     private boolean comprobarColumna(int columna, int elemento, int[][] matriz)
     {
     
      boolean resultado = false;
         int numeroColumna = 0;
   
      for ( int i = 0; i < matriz.length; i ++ )
        if ( matriz[i][(columna-1)] == numeroColumna ){
        resultado = true;
    }
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
