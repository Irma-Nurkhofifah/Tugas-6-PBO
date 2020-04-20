/* 	Nama 	: Irma Nurkhofifah M.
	Nim 	: 13020180096
	waktu	: 18 april 2020
	tugas 6
*/

//nomor 9
class persegi extends BangunDatar {
    float sisi;

    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}