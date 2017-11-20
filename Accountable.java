public abstract class Accountable implements Accountab{
    private double importo;
    private AccountableType type;

    public Accountable(double importo) {
        this.importo=importo;

        if(importo>=0) type=AccountableType.ACCREDITO;
        else type = AccountableType.ADDEBITO;
    }

    public AccountableType getType(){
        return type;
    }

    @Override
    public double getImport() {
        return importo;
    }
}
