/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_busqueda_binaria;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class EVA3_4_BUSQUEDA_BINARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap= new Scanner(System.in);
         int[] original = new int[20];
        int[]selection;
        llenarArreglo(original);
        imprimirArreglo(original);
        selectionSort(original);
        imprimirArreglo(original);
        System.out.println("VALOR A BUSCAR");
        int valor= cap.nextInt();
        System.out.println("Su valor esta en: "+binarySearch(original, valor));
    }
    public static void selectionSort( int[]datos){
      for (int i = 0; i < datos.length - 1; i++) {
            int min = i; 
            
            for (int j = i + 1; j < datos.length; j++) {
                if (datos[j] < datos[min]) {
                    min = j; 
                }
            }
            if(min!=i){
            int temp = datos[i];
            datos[i] = datos[min];
            datos[min] = temp;
            }
      }          
        }
     public static void llenarArreglo(int[]datos){
        for(int i = 0; i<datos.length;i++){
            datos[i]=(int)(Math.random()*100);
        }
    }
    public static void imprimirArreglo(int[]datos){
        for(int i = 0; i<datos.length;i++){
            System.out.print("{"+datos[i]+"}");
        }
         System.out.println();
    }
    public static int binarySearch(int[] arreglo, int valor)
    {
        return binarySearchRec(arreglo, valor,0,arreglo.length);
    }
    public static int binarySearchRec(int[]arreglo,int valor,int ini, int fin){
        int resu=-1;
        if(ini<=fin){
            int mid= ini+((fin-ini)/2);
            if(valor>arreglo[mid]){
                resu=binarySearchRec(arreglo, valor, mid+1, fin);
            }else if(valor<arreglo[mid]){
                resu= binarySearchRec(arreglo, valor, ini, mid-1);
            }
            else{
                resu=mid;
            }
        }
    return resu;
    }
}
