import java.util.HashMap;

public class Banca {
    private String IBAN;
    private HashMap<String, ContoInterface> conti;
   /* private String tipo1="Conto Corrente";
    private String tipo2="Conto Web";
    private String tipo3="Conto Deposito";*/
    private int contiAttivi;
    public Banca(String IBAN) {
        this.IBAN = IBAN;
        conti = new HashMap<String, ContoInterface>();
        contiAttivi=0;
    }
    public boolean addConto(String cf,TipiConti tipo ){
        switch (tipo){
            case CC:
                conti.put("IT"+IBAN+contiAttivi,new ContoCorrente("IT"+IBAN+contiAttivi,cf));
                contiAttivi++;
                return true;
            case CW:
                conti.put("IT"+IBAN+contiAttivi,new ContoWeb("IT"+IBAN+contiAttivi,cf));
                contiAttivi++;
                return true;
            case CD:
                conti.put("IT"+IBAN+contiAttivi,new ContoDeposito("IT"+IBAN+contiAttivi,cf));
                contiAttivi++;
                return true;
        }
        return false;
    }
    public boolean operazione(String iban,double importo){
        if(conti.containsKey(iban)) {
               return conti.get(iban).operazione(importo);
        }
        return false;
    }

    public void print(String iban){
        if(conti.containsKey(iban)) conti.get(iban).printConto();
        else System.out.println("Conto non esistente");
    }

    public boolean changePasswordCw(String iban,String oldPass,String newPass){
        if(conti.containsKey(iban) && (conti.get(iban) instanceof ContoWeb && oldPass.equals(((ContoWeb) conti.get(iban)).getPassMem()))){
            return ((ContoWeb) conti.get(iban)).changePassword(newPass);
        }
         return false;

    }
    public boolean identificazioneCw(String iban,String password){
        if(conti.containsKey(iban) && (conti.get(iban) instanceof ContoWeb)){
            return ((ContoWeb) conti.get(iban)).identificazione(password);
        }
        return false;

    }
}
