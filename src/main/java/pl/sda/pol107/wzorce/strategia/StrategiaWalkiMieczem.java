package pl.sda.pol107.wzorce.strategia;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
public class StrategiaWalkiMieczem implements IStrategiaWalki {
    @Override
    public void walcz() {
        System.out.println("Ciach ciach mieczem!");
    }
}
