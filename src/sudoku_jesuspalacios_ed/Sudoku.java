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
         //Creamos las variables
         int[][] matriz = new int[9][9];
         int matrizSudoku = 1;
         
         //Creamos un switch de dos cases con las matrices el case 1 esta fuesto por defecto
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
     // Creamos metodo toString
     @Override
     public String toString()
     {
     String resultadoFinal = "";
     return resultadoFinal;
     }
     public void modificarElemento(int fila, int columna, int elemento) throws
    SudokuException 
     {
         //Aquí iría un el método para modificar elemento.
     }

     public void vaciarElemento(int fila, int columna)
     {
         //Aquí iría un el método para vaciar elemento.
     }
     private boolean comprobarFila(int fila, int elemento, int[][] matriz)
     {
         //Creamos variables
     boolean resultado = false; //Ponemos el resultado por defecto en false
         int numero = 0;
         //Creamos bucle for que hará que compruebe las filas de la matriz
     for ( int i = 0; i < matriz.length; i ++ )
         //Metemos dentro de un if que si el caso se cumple el resultado será true
        if ( matriz[(fila-1)][i] == numero ){
         resultado = true;
        }
        //En caso de que fuera 0 el resultado sería false
         if ( numero == 0 ) {
             resultado = false;
         }
     return resultado;
     }
     
     private boolean comprobarColumna(int columna, int elemento, int[][] matriz)
     {
     //Creamos variables
      boolean resultado = false; //Ponemos el resultado por defecto en false
         int numeroColumna = 0;
      //Creamos bucle for que hará que compruebe las columnas de nuestra matriz   
      for ( int i = 0; i < matriz.length; i ++ )
          //Metemos dentro de un if que si el caso se cumple el resultado será true
        if ( matriz[i][(columna-1)] == numeroColumna ){
        resultado = true;
        }
     return resultado;
     }
     private boolean comprobarCuadrante(int fila, int columna, int elemento,  int[][] matriz)
     {
         //Creamos Variables
            int minimo_fila;
            int maximo_fila;
            int minimo_columna;
            int maximo_columna;
            boolean resultado = false; //Ponemos el resultado por defecto en false
            
            //Asignamos las filas del cuadrante
            
           if ( fila > 0 && fila < 4){
            minimo_fila = 0;
            maximo_fila = 2;
           }
           else if ( fila > 3 && fila < 7 ){
            minimo_fila = 3;
            maximo_fila = 5;
           }
           else{
            minimo_fila = 6;
            maximo_fila = 8;
           }
            
           //Asignamos las columnas del cuadrante
           
           if ( columna > 0 && columna < 4){
            minimo_columna = 0;
            maximo_columna = 2;
           }else if ( columna > 3 && columna < 7 ){
            minimo_columna = 3;
            maximo_columna = 5;
           }else{
            minimo_columna = 6;
            maximo_columna = 8;
           }
           
           //Recorremos el rango del cuadrante para buscar el valor
           
           for ( int f = minimo_fila; f <= maximo_fila; f++ )
            for ( int i = minimo_columna; i <= maximo_columna; i++)
                if ( matriz[f][i] == elemento ){
                    resultado = true;
                }
                 //En caso de que sea 0 resultado será falso
                 if ( elemento == 0 ){
                     resultado = false;
                 }

     return resultado;
     }
     
     private boolean puedoInsertar(int fila, int columna, int elemento)
     {
         boolean resultado = false; //Ponemos el resultado por defecto en false
         //Hacemos un condicional if que diga que si elementoe es mayo o igual a 0 y menor que 10 resultado sea true
        if ( elemento >= 0 && elemento < 10)
         resultado= true;
        else //En caso de que no se cumpla resultado es false
         resultado= false;
        
     return resultado;
     }
}
