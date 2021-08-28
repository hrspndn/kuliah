/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author HARIS
 */
public class array {
    public static void main (String[] args){
        int[] nilai = {-5, -3, -6, -3, -4};
        int min = cariMin(nilai);
        int max = cariMax(nilai);
        double rata2 = cariRata2(nilai);
        System.out.println("a. Nilai rata-rata array: " +rata2);
        System.out.println("b. Nilai Maksimum: " +max);
        System.out.println("c. Nilai Minimum: " +min);
        System.out.println("d. Nilai -3 terdapat pada index: " +nilai[1]);
    }
    static double cariRata2(int[] arr){
        double sum =0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];}
    double avg = sum / arr.length;
    return avg;
    }
    
    static int cariMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int cariMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if ( min > arr[i]){
            min = arr[i];
            }
        }
        return min;
    }

}

