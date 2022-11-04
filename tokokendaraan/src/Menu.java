import java.util.Scanner;

public class Menu {
    String namasell,namaken;
    int harga1, p, dana;
    Scanner scan = new Scanner(System.in);



    public void listbrg(){                                  //Method
        System.out.println("----- PILIHAN ANDA -----");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("Ketik Apapun Untuk Kembali");
        System.out.print("Pilih : "); p = scan.nextInt();
        switch (p){
            case 1:
                System.out.println("List Mobil");
                Mobil.listmob();
                new Main();
            case 2:
                System.out.println("List Motor");
                Motor.listmot();
                new Main();
            default:
                new Main();
        }
    }

    final void beli(){                          //Final Method Procedure
        System.out.println("==== Beli ====");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("Ketik Apapun Untuk Kembali");
        System.out.print("Pilih : "); p = scan.nextInt();
        switch (p){
            default:
                break;
        }
    }
    public Menu(int dana){
        this.dana = dana;
    }
    public int getDana(){
        return dana;
    }

}
