/* 	Nama 	: Irma Nurkhofifah M.
	Nim 	: 13020180096
	waktu	: 18 april 2020
	tugas 6
*/

//nomor 9
public class Main {
    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat objek persegi dan mengisi nilai properti
        persegi Persegi = new persegi();
        Persegi.sisi = 2;
        
        // memanggil method luas dan keliling
        
        Persegi.luas();
        Persegi.keliling();
        
    }
}