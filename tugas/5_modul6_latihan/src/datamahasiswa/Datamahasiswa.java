/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.Scanner;

/**
 *
 * @author HARIS
 */
public class Datamahasiswa {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        Scanner scan  = new Scanner(System.in);
        
        
        String def="Masukan ", univ, nim, nama, alamat, balik=" "  ;
        int jurusan;
        

        
        do {
        
        System.out.println("|     Aplikasi Data Mahasiswa         |");
        System.out.println("===========================================");
        System.out.print(def + "Universitas \t: " );
        univ = input.nextLine();
        System.out.print(def + "NIM \t\t: " );
        nim = input.nextLine();
        System.out.print(def + "NAMA \t\t: " );
        nama = input.nextLine(); 
        System.out.print(def + "ALAMAT \t\t: " );
        alamat = input.nextLine();
        System.out.print("Pilihan : "
            + "\n 61. MATEMATIKA "
            + "\n 62. BIOLOGI"
            + "\n 63. KIMIA  "
            + "\n 64. FISIKA"
            + "\n 65. TEKNIK INFORMATIKA"
            + "\n 66. TEKNIK ARSITEKTUR \n\nMasukan Pilihan :"
            );
        jurusan = input.nextInt();
        Datamahasiswa mn=new Datamahasiswa();
       
        System.out.println("+------------------------------------------+");
        System.out.println("|             Biodata Mahasiswa            |");
        System.out.println("+------------------------------------------+");
        System.out.println("| Universitas\t: " + univ);
        System.out.println("| NIM\t\t: " + nim);
        System.out.println("| NAMA\t\t: " + nama);
        System.out.println("| ALAMAT\t: " + alamat);
        
        
        switch(jurusan) {
            case 61: System.out.println("| JURUSAN\t: MATEMATIKA");
            break;
            case 62: System.out.println("| JURUSAN\t: BIOLOGI");
            break;
            case 63: System.out.println("| JURUSAN\t: KIMIA");
            break;
            case 64: System.out.println("| JURUSAN\t: FISIKA");
            break;
            case 65: System.out.println("| JURUSAN\t: TEKNIK INFORMATIKA");
            break;
            case 66: System.out.println("| JURUSAN\t: TEKNIK ARSITEKTUR");
            break;
            default :System.out.println ("anda salah memilih");
            break;
            
        }
        
        System.out.print("\nApakah anda ingin memasukan data kembali ? [Y/T] : ");
        balik = scan.nextLine();
        System.out.println("\n");
        }
        while (balik.equals("y")||balik.equals("Y"));
        
        System.out.println("+------------------------------------------+");
        //}
    }

    }
    

