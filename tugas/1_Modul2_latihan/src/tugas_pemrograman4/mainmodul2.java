/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pemrograman4;

/**
 *
 * @author HARIS
 */
public class mainmodul2 {
    public static void main(String[] args){
        int total_harga;
        
        Tugas_pemrograman4 brg1 = new Tugas_pemrograman4();
        brg1.setNama("BolPoint");
        brg1.setStok(10);
        brg1.setHarga_satuan(2000);
        brg1.setHarga(10, 2000);
        int a=brg1.getHarga();
        
        Tugas_pemrograman4 brg2 = new Tugas_pemrograman4();
        brg2.setNama("Pensil");
        brg2.setStok(10);
        brg2.setHarga_satuan(1000);
        brg2.setHarga(10, 1000);
        int b=brg2.getHarga();
        
        Tugas_pemrograman4 brg3 = new Tugas_pemrograman4();
        brg3.setNama("Penghapus");
        brg3.setStok(10);
        brg3.setHarga_satuan(500);
        brg3.setHarga(10, 500);
        int c=brg3.getHarga();
        
        System.out.println("Nama Barang: " +brg1.getNama());
        System.out.println("Stok Barang: " +brg1.getStok());
        System.out.println("Harga Satuan Barang: " +brg1.getHarga_satuan());
        System.out.println("Harga Barang: " +brg1.getHarga());
        
        System.out.println("\nNama Barang: " +brg2.getNama());
        System.out.println("Stok Barang: " +brg2.getStok());
        System.out.println("Harga Satuan Barang: " +brg2.getHarga_satuan());
        System.out.println("Harga Barang: " +brg2.getHarga());
        
        System.out.println("\nNama Barang: " +brg3.getNama());
        System.out.println("Stok Barang: " +brg3.getStok());
        System.out.println("Harga Satuan Barang: " +brg3.getHarga_satuan());
        System.out.println("Harga Barang: " +brg3.getHarga());
        
        total_harga=a+b+c;
        System.out.println("\n Total Harga: " +total_harga);
    }
}
