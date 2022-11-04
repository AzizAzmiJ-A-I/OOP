public class Motor extends Menu{
    String tipeTor,spekTor,detailTor;

    private Motor(String nama, String bike, String tipeMotor, String spekMotor, String detailMotor, int cost){
        super(cost);
        namasell = nama;
        namaken = bike;
        tipeTor = tipeMotor;
        spekTor = spekMotor;
        detailTor = detailMotor;
        harga1 = cost;

        System.out.println("Nama Penjual    : " + namasell);
        System.out.println("Nama Kendaraan  : " + namaken);
        System.out.println("Tipe Mobil      : " + tipeTor);
        System.out.println("Spesifikasi     : " + spekTor);
        System.out.println("Detail          : " + detailTor);
        System.out.println("Harga           : " + harga1);
        System.out.println();
    }

    static void listmot(){
        Motor bike1 = new Motor("Abdul","Vario","Matic","90cc","5 Bulan Pakai",15000000);
        Motor bike2 = new Motor("Somat","KLX","OffRoad","90cc","Baru",31000000);
    }

    @Override
    public void listbrg() {
        super.listbrg();
    }
}
