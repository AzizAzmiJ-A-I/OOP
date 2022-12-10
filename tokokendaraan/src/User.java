public abstract class User implements Action {
    protected String Nama, nohp, Pass ;
    private int saldo,dana;


    @Override
    public boolean login() {
        System.out.println("Masukkan username : ");
        Nama = new java.util.Scanner(System.in).nextLine();

        System.out.println("Masukkan password : ");
        Pass = new java.util.Scanner(System.in).nextLine();

        System.out.println("Masukkan nomer hp : ");
        nohp = new java.util.Scanner(System.in).nextLine();

        // Jika
        if ((Nama == " ") && (Pass == " ") && (nohp == " ")) {
            System.out.println("Login Berhasil");
            return true;
        } else {
            System.out.println("Login Gagal");
            return false;
        }

    }

    public String getlogin() {
        return "\n"+"Anda Login Sebagai Guest";
    }

    @Override
    public void logout() {
        System.out.println("Terima Kasih telah menggunakan");
    }


    // protected void setNama(String nama) {      //Setter
    //     Nama = nama;
    // }
    // protected String getNohp() {        //Getter
    //     return nohp = "081xxxx";
    // }
    // protected int getSaldo() {          //Getter
    //     return saldo = 0 ;
    // }


    abstract void kalkulasi();
}

