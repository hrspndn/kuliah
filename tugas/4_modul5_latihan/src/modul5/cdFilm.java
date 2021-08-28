/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author HARIS
 */
public class cdFilm extends rentalvcd {
    public String pemain;
        public String sutradara;
        public String kategori;
    public cdFilm(String pemain, String sutradara, String kategori, String judul, String publiser, int stok, String judul1) {
        super(judul, publiser, stok, judul1);
        this.pemain = pemain;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }
   cdFilm() {
    }
    
}
