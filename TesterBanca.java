public class TesterBanca {
    public static void main(String[] args) {

        Banca banca1=new Banca("UBI");

        System.out.println( banca1.addConto("DGSFRC",TipiConti.CC));
       // banca1.print("ITUBI0");
        //System.out.println("CHANGEPASSWORD:     "+banca1.changePasswordCw("ITUBI0","changeme","Ciao"));
        //System.out.println("IDENTIFICAZIONE:    "+banca1.identificazioneCw("ITUBI0","Ciao"));

        Stipendio stipendio1=new Stipendio(1000);
        AbbonamentoTV sky=new AbbonamentoTV(-2000);

        System.out.println(banca1.operazione("ITUBI0",1000));
        banca1.print("ITUBI0");
      //  System.out.println(banca1.operazione("ITUBI0",0));

        banca1.addAccountable("ITUBI0",stipendio1);
        banca1.addAccountable("ITUBI0",sky);
        banca1.fineMese();
        banca1.print("ITUBI0");
        //System.out.println( banca1.addConto("DGSFRC",TipiConti.CW));
        //banca1.print("ITUBI1");
    }
}
