public class ContoDeposito  extends Conto {

    public ContoDeposito(String iban, String cf) {
        super(iban, cf);
    }

    @Override
    public boolean operazione(double importo) {
        if (importo>=0){
            saldo+=importo;
            return true;
        }
        if (importo<0)return false;
        return false;
    }
}
