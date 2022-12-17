import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int plh ;
        int plh1,plh2;
        Scanner scan = new Scanner(System.in);
        Menu menu1 = new Menu(0);                    //Instasiasi, buat Objek
        User2 guest = new User2() ;
        System.out.println("===== SELAMAT DATANG DI DEALER KENDARAAN =====");
        System.out.println("1. Guest Login");
        System.out.println("2. Sign In ");
        System.out.print("Pilih : ");   plh1 = scan.nextInt();
        do {
            switch (plh1) {
                case 1:
                    if (guest.login()) {
                        guest.getlogin();
                    }
                    break;
                case 2:
                    System.out.println("Nama Anda : ");
                    break;
                default:
                    guest.logout();
                    return ;
            }
        }while (plh1 >=3);

        System.out.println("--- SELAMAT DATANG DI DEALER KENDARAAN ---");
        System.out.println("WELCOME : "+ guest);
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