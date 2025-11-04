/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_ordenamiento;

/**
 *
 * @author aleja
 */
public class EVA3_1_ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] original = new int[10];
        long ini, fin, tiempo;
        int[]selection;
        llenarArreglo(original);
        imprimirArreglo(original);
        selection=copiarArreglo(original);
        ini=System.nanoTime();
        selectionSort(selection);
        fin=System.nanoTime();
        System.out.println("SELECTION SORT");
        imprimirArreglo(selection);
        tiempo=fin-ini;
        System.out.println("T ="+ tiempo );
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
    }
    public static int[] copiarArreglo(int[]datos){
        int[] nuevo = new int [datos.length];
        for(int i=0; i<datos.length;i++){
            nuevo[i]=datos[i];
        }
          return nuevo; 
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
    }

