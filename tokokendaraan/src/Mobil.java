public class Mobil extends Menu{        //Inheritance dari Menu
    String tipeBil,spekBil,detailBil;        //variabel subclass

    //Method dengan Parameter
    private Mobil(String nama, String car, String tipeMobil, String spekMobil, String detailMobil, int cost){
        super(cost);
        namasell = nama;
        namaken = car;
        tipeBil = tipeMobil;
        spekBil = spekMobil;
        detailBil = detailMobil;
        harga1 = cost;

        System.out.println("Nama Penjual    : " + namasell);
        System.out.println("Nama Kendaraan  : " + namaken);
        System.out.println("Tipe Mobil      : " + tipeBil);
        System.out.println("Spesifikasi     : " + spekBil);
        System.out.println("Detail          : " + detailBil);
        System.out.println("Harga           : " + harga1);
        System.out.println();
    }
    static void listmob(){
        Mobil cars1 = new Mobil("Ahmad", "Toyota", "Sports", "120cc", "Penggunaan 2 tahun", 90000000);
        Mobil cars2 = new Mobil("Udin", "Scania", "Truk", "100cc", "Baru", 150000000);
    }

    @Override
    public int getDana() {
        return super.getDana();
    }
}
