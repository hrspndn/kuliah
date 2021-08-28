/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author HARIS
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriks_a ={
            {1,2},
            {3,5},
            {6,7},       
        };
        int[][] matriks_b ={
            {8,9},
            {10,11},
            {12,13},   
        };
        System.out.println("Matriks A");
        printArray(matriks_a);
        
        System.out.println("Matriks B");
        printArray(matriks_b);
        
        int baris_a = matriks_a.length;
        int kolom_a = matriks_a[0].length;
        
        int[][] hasil = new int[baris_a][kolom_a];
        
        for (int i = 0; i < baris_a; i++){
            for (int j =0; j< kolom_a; j++){
            hasil[i][j] = matriks_a [i][j] + matriks_b[i][j];
        }
      }
        System.out.println("Hasil Penjumlahan");
        printArray(hasil);
    }
    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        
        
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]); 
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    
}
