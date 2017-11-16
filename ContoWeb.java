public class ContoWeb extends Conto {
    private boolean firstlogin;

    public String getPassMem() {
        return passMem;
    }

    private String passMem="changeme";  //password memorizzata di default

    public ContoWeb(String iban, String cf) {
        super(iban, cf);
        firstlogin=false;
        id=false;
    }

    public boolean changePassword(String password){
        passMem=password;
        firstlogin=true;
        return true;
    }

    public boolean identificazione(String password){
        if(password.equals(passMem) && firstlogin){
            id=true;
            return true;
        }

        return false;
    }





  /*  public boolean preleva(double importo) {
        if (importo > 0) return false;
            if (identif && (importo < 0) && (-importo < saldo)) {
                saldo += importo;
                return true;
            }
        return false;
        }
    
    public boolean changePassword(String passVecchia,String passNuova){
        if(passVecchia.equals(passMem)){
            passMem=passNuova;
            return true;
        }
        else return false;
    }

*/
}
