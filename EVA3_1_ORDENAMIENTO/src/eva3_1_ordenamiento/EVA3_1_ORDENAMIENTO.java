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
        int[]insertion;
        int[] bubble;
        int[] quick;
        llenarArreglo(original);
        
        selection=copiarArreglo(original);
        insertion=copiarArreglo(original);
        bubble=copiarArreglo(original);
        quick=copiarArreglo(original);
         System.out.println("SELECTION SORT");
        ini=System.nanoTime();
        selectionSort(selection);
        fin=System.nanoTime();
        imprimirArreglo(selection);
        tiempo=fin-ini;
        System.out.println("T ="+ tiempo );
      
        ini = System.nanoTime();
        insertionSort(insertion);
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("\nINSERTION SORT:");
        imprimirArreglo(insertion);
        System.out.println("T: " + tiempo + " NS");
        
        
         System.out.println("bubbblen SORT");
        ini=System.nanoTime();
        bubbleSort(bubble);
        fin=System.nanoTime();
        imprimirArreglo(bubble);
        tiempo=fin-ini;
        System.out.println("T ="+ tiempo );
        
        
        System.out.println("\nQUICK SORT");
        ini = System.nanoTime();
        quickSort(quick, 0, quick.length - 1);
        fin = System.nanoTime();
        imprimirArreglo(quick);
        tiempo = fin - ini;
        System.out.println("T = " + tiempo + " ns");
        
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
    public static int[] copiarArreglo(int[]datos){
        int[] nuevo = new int [datos.length];
        for(int i=0; i<datos.length;i++){
            nuevo[i]=datos[i];
        }
          return nuevo; 
    }
    //O(N2)
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
   // O(N2)
     /*  prev> temp
                intercambiamos y nos movemos hacia atras
                prev<temp
                        nos debemos de detener o llegamos al inicio de arreglo*/
   public static void insertionSort(int[] datos) {
    for (int i = 1; i < datos.length; i++) {
        for (int j = i; j > 0; j--) {
            int prev = j - 1; 
           
            if(datos[j]<datos[prev]){
                int temp= datos[j];
                datos[j]=datos[prev];
                datos[prev]=temp;
            }
            else {
           
                break;
            }
        }
    }
}
  // O(N2)
public static void bubbleSort(int[] datos){
       for (int i = 0; i < datos.length - 1; i++){
          for (int j = 0; j < datos.length-1; j++){
             if(datos[j] > datos[j + 1]){
               int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
              }
                  
          }
      }
            
              }

        public static void quickSort(int[] datos, int inicio, int fin) {
        int i = inicio;
        int j = fin;
        int pivote = datos[(inicio + fin) / 2];

        while (i <= j) {
            while (datos[i] < pivote) {
                i++;
            }
            while (datos[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp = datos[i];
                datos[i] = datos[j];
                datos[j] = temp;
                i++;
                j--;
            }
        }

        if (inicio < j) {
            quickSort(datos, inicio, j);
        }
        if (i < fin) {
            quickSort(datos, i, fin);
        }
    }
}



             
    
    

