package pl.sda.pol107.ptaszki;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
public class Kukułka extends Ptak {
    @Override
    public void spiewaj() {
        System.out.println("Ku ku ");
    }

    public void spiewaj(String co) {
        System.out.println("La la la: " + co);
    }

    public void spiewaj(Integer co) {
        System.out.println("La la la: " + co);
    }
}
