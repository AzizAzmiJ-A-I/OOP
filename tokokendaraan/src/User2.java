public class User2 extends User implements  Action{

    protected String Nama, nohp, Pass ;



    @Override
    public boolean login() {
            System.out.print("Masukkan username : ");
            Nama = new java.util.Scanner(System.in).nextLine();

            System.out.print("Masukkan password : ");
            Pass = new java.util.Scanner(System.in).nextLine();

            System.out.print("Masukkan nomer hp : ");
            nohp = new java.util.Scanner(System.in).nextLine();

            // Jika
            if ((Nama.equals("guest")) && (Pass.equals("guest")) && (nohp.equals("guest"))) {
                oklogin();
                return false;
            } else {
                failogin();
                return false;
            }
    }

    @Override
    public void oklogin() {
        System.out.println("\n"+"Anda Login Sebagai Guest");
    }

    @Override
    public void failogin() {
        System.out.println("\n"+"Gagal Login Sebagai Guest");
        System.exit(0);
    }

    @Override
    public String signin() {
        System.out.print("Masukkan username : ");
        Nama = new java.util.Scanner(System.in).nextLine();

        System.out.print("Masukkan password : ");
        Pass = new java.util.Scanner(System.in).nextLine();

        System.out.print("Masukkan nomer hp : ");
        nohp = new java.util.Scanner(System.in).nextLine();

        // Jika
    }

    @Override
    public void logout() {
        System.out.println("Terima Kasih telah menggunakan");
        return ;
    }

    @Override
    void kalkulasi() {

    }
}
