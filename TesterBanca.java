public class TesterBanca {
    public static void main(String[] args) {

        Banca banca1=new Banca("UBI");

        System.out.println( banca1.addConto("DGSFRC",TipiConti.CW));
        banca1.print("ITUBI0");
        System.out.println("CHANGEPASSWORD:     "+banca1.changePasswordCw("ITUBI0","changeme","Ciao"));
        System.out.println("IDENTIFICAZIONE:    "+banca1.identificazioneCw("ITUBI0","Ciao"));


        System.out.println(banca1.operazione("ITUBI0",140));
        banca1.print("ITUBI0");
        System.out.println(banca1.operazione("ITUBI0",-40));
        banca1.print("ITUBI0");
        System.out.println( banca1.addConto("DGSFRC",TipiConti.CW));
        banca1.print("ITUBI1");
    }
}
