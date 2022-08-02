package pl.sda.pol107.wzorce.strategia;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
public class Bohater {
    private String imie;
//    private String narzędzieWalki;
    private IStrategiaWalki strategiaWalki;

    public Bohater(String imie) {
        this.imie = imie;
        this.strategiaWalki = new StrategiaWalkiMieczem();
//        this.narzędzieWalki = "miecz";
    }

    public void walcz() {
//        if (narzędzieWalki.equals("miecz")) {
//            System.out.println("Ciach ciach mieczem!");
//        }else if (narzędzieWalki.equals("łuk")){
//            System.out.println("Fiu fiu strzały lecą!");
//        }
        strategiaWalki.walcz();
    }

    public void setStrategiaWalki(IStrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }
}
