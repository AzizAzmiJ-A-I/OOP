public abstract class User implements Action {
    private int saldo,dana;
    public abstract String signin() ;

    public String getlogin() {
        return "\n"+"Anda Login Sebagai Guest";
    }

    @Override
    public void logout() {
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

