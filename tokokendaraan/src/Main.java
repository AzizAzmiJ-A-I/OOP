import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int plh ;
        int plh1,plh2;
        Scanner scan = new Scanner(System.in);
        Menu menu1 = new Menu(0);                    //Instasiasi, buat Objek
        User user1 = new User();
        System.out.println("===== SELAMAT DATANG DI DEALER KENDARAAN =====");
        System.out.println("1. Guest Login");
        System.out.println("2. Sign In ");
        System.out.print("Pilih : ");   plh1 = scan.nextInt();
        switch (plh1) {
            case 1:
                user1.setNama("Guest");
                user1.getNohp();
                user1.getSaldo();
                break;
            case 2:
                System.out.println("Nama Anda : ");
                break;
            default:
                break;
        }

        System.out.println("--- SELAMAT DATANG DI DEALER KENDARAAN ---");
        System.out.println("WELCOME : "+ user1);
        System.out.println("1. List Kendaraan ");
        System.out.println("2. Beli");
        System.out.println("Ketik Apapun Untuk Exit");
        System.out.print("Pilih : ");   plh = scan.nextInt();
        switch (plh) {
            case 1:
                menu1.listbrg();
                break;
            default:
                break;
        }
    }

    public Main() {
        super();
    }
}