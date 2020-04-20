/* 	Nama 	: Irma Nurkhofifah M.
	Nim 	: 13020180096
	waktu	: 18 april 2020
	tugas 6
*/

//nomor 6
public class AnimalTest
{
 
    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        animal1.nama = "Binatang Abstrak";
        animal1.mengeluarkanSuara();
 
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Kitten";
        kucing1.mengeluarkanSuara();
 
        Animal animal2 = new Kucing();
        animal2.nama = "Mew";
 
    }
 
}