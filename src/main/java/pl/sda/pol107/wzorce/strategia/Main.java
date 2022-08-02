package pl.sda.pol107.wzorce.strategia;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
public class Main {
    public static void main(String[] args) {
        Bohater bohater = new Bohater("Marian");

        bohater.walcz(); // Ciach ciach mieczem!
        bohater.setStrategiaWalki(new StrategiaWalkiŁukiem());
        bohater.walcz(); // Fiu fiu strzały lecą!
    }
}
