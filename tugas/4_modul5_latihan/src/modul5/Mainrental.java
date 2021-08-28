/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;
import java.util.Scanner;
/**
 *
 * @author HARIS
 */
public class Mainrental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           cdFilm film = new cdFilm();
       
        System.out.println("================");
         System.out.println("SELAMAT DATANG DIRENTAL VCD RYS");
         System.out.println("===============");
         System.out.println("Silahkan Masukan VCD Film yang ingin anda sewa");
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        {

        System.out.print("Masukan film      : ");
            film.judul = input.nextLine();
            System.out.print("Pemain            : ");
            film.pemain = input.nextLine();
            System.out.print("Sutradara         : ");
            film.sutradara = input.nextLine();
            System.out.print("Publisher         : ");
            film.publiser = input.nextLine();

        System.out.println("Kategori          : ");
        System.out.println("1.Semua Umur");
        System.out.println("2.Remaja");
        System.out.println("3.Dewasa");
        System.out.println("4.Anak-Anak");
        System.out.print("Masukan Pilihan   : ");
        int pil;
        pil = input1.nextInt();
        if (pil == 1){
        film.kategori = "Semua Umur";
        }
        else if (pil == 2){
        film.kategori = "Remaja";
        }
        else if (pil == 3){
        film.kategori = "Dewasa";
        }
        else if (pil == 4){
        film.kategori = "Anak-Anak";
        }
        else{
        film.kategori = "Pilihan Tidak Ada";
        }

            System.out.print("Stok              : ");
            film.stok = input.nextInt();
        System.out.println("Judul Film      : "+film.judul);
        System.out.println("Pemain          : "+film.pemain);
        System.out.println("Sutradara       : "+film.sutradara);
        System.out.println("Publisher       : "+film.publiser);
        System.out.println("Kategori        : "+film.kategori);
        System.out.println("Stok            : "+film.stok);
} 
       
    }
}
    

