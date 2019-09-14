/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento2;

import java.util.Scanner;

/**
 *
 * @author jenny.valencia
 */
public class Seguimiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NumeroUnoAlCienWhile();
        //NumerosDelUnoAlCienFor();
        //NumerosDelCienAlUnoWhile ();
        //NumerosDelCienAlUnoFor();
        //NumerosParesWhile();        
        //NumerosParesFor();
        //SumaDeNumerosWhile();
        //SumaDeNumerosFor ();
        //ImprimirMismoNumeroDeAsteriscos();
        TablaTxt();
    }
 //Mostrar los numeros del 1 al 100 con While
    public static void NumeroUnoAlCienWhile() {
       System.out.println("Numeros del 1 al 100 con While: ");
         int i=1;
         while(i<=100) {
                   System.out.println(i);
                   i++;
         }
    }
    
    //Mostrar los numeros del 1 al 100 con For
public static void NumerosDelUnoAlCienFor (){
    System.out.println("Numeros del 1 al 100 con For: ");
    for (int i = 1; i<=100; i++){
    System.out.println(""+i);
}
}

// Mostrar los numeros del 100 al 1 con While
 public static void NumerosDelCienAlUnoWhile (){
              System.out.println("Numeros del 100 al 1 con While: ");
         int i=100;
         while(i>=1) {
                   System.out.println(i);
                   i--;
         }
  }
 
 //Mostrar los numeros 100 al 1 con For
 public static void NumerosDelCienAlUnoFor (){
     System.out.println("Numeros del 100 al 1 con For:");
     for (int i = 100; i>=1; i--){
         System.out.println(""+i);
     }
     }
 
 //Mostrar los numeros pares que hay del 1 al 150 con While
 public static void NumerosParesWhile (){
 System.out.println ("Numeros pares que hay del 1 al 150 con While:");
 int i=1;
 while (i<=150){
 if (i%2==0){   
 
     System.out.println(""+i);
 }
     i++;
     
 }
 }
 
 //Mostrar los numeros pares que hay del 1 al 150 con For
 public static void NumerosParesFor (){
  System.out.println ("Numeros pares que hay del 1 al 150 con For:");  
  
  for (int i=1; i<=150;i++){
  if (i%2==0){
    System.out.println(""+i);  
      
      }
      }
  }
 
 //Imprimir la suma de los numeros que van del 1 al 200 con While
 public static void SumaDeNumerosWhile (){
     System.out.println ("Suma de numeros del 1 al 200 con While:");
     int suma = 0;
     int i=1;
     while(i<=200){
     suma = suma + i;
     i++;
     }
   System.out.println ("La suma de los numeros del 1 al 200 es:" + suma);  
     
 }
 
 public static void SumaDeNumerosFor (){
     System.out.println ("Suma de numeros del 1 al 200 con For:");
     int suma = 0;
     for (int i = 1; i <=200; i++){
         suma = suma + i;
     }
     
     System.out.println ("La suma de los numeros del 1 al 200 es:" + suma);
 }
 
 //Ingresar un numero y mostrar en pantalla el mismo numero de asteriscos con For
 public static void  ImprimirMismoNumeroDeAsteriscos(){
  System.out.println ("Ingrese un numero:");
  Scanner scanner = new Scanner (System.in);
  int NumeroDeAsteriscos = scanner.nextInt();
  for (int i = 0; i< NumeroDeAsteriscos; i++){    
 System.out.println("*");
 }
  System.out.println ("Esta la cantidad de asteriscos correspondientes al numero que ingresó:");
}


//Mostrar una tabla de 10*10 donde los numeros pares tienen una X y los impares un 0
public static void TablaTxt (){
        int [][] matriz = new int [10][10];
        int numero = 1;
   //Aqui lleno la matriz con los numeros pares e impares
   for (int fila = 0; fila < 10; fila ++){
       for (int columna = 0; columna < 10; columna++){
        matriz[fila][columna] = numero;
        numero++;
        
    System.out.print (matriz[fila][columna]); 
       }
       System.out.println ();
   }
//Aqui muestro en pantalla X y 0 dependiendo si el numero es par o impar
   for (int fila = 0; fila < 10; fila ++){
       for (int columna = 0; columna < 10; columna++){
        if (matriz [fila][columna]%2==0){
        System.out.print (" X ");
       }
        else{
            System.out.print (" 0 ");
        }
       }
       System.out.println ();
   }
      
       
       
   }
    
}



  
 
 
 
 






 



