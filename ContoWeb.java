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

    public boolean changePassword(String oldPass,String newPass){
        if(oldPass.equals(passMem)){
        passMem=newPass;
        firstlogin=true;
        id=false;
        return true;
        }
        else return false;
    }

    public boolean identificazione(String password){
        if(password.equals(passMem) && firstlogin){
            id=true;
            return true;
        }

        return false;
    }
}
