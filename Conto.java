public abstract class Conto implements ContoInterface{


    public double getSaldo() {
        return saldo;
    }

    public String getCf() {
        return cf;
    }

    public String getIban() {
        return iban;
    }

    private String iban;
    protected double saldo;
    private String cf;
    protected boolean id;

    public Conto(String iban,String cf){
        this.iban=iban;
        this.cf=cf;
        saldo=0;
        id=true;

    }

    public boolean operazione(double importo){
        if(id) {
            if (importo >= 0) {
                saldo += importo;
                return true;
            }
            if (importo < 0 && -importo < saldo) {
                saldo += importo;
                return true;
            }
        }
        return false;
    }
    public void printConto(){
        if(id)System.out.println("iban: "+iban+"  cf: "+cf+"  saldo: "+saldo);
        else System.out.println("Identificazione non avvenuta");
    }
}
