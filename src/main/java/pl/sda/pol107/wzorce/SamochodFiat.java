package pl.sda.pol107.wzorce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
@Data
public class SamochodFiat {
    private String nazwa;
    private double pojemnosc;
    private String kolor;
    private String model;

    SamochodFiat(String nazwa, double pojemnosc, String kolor, String model) {
        this.nazwa = nazwa;
        this.pojemnosc = pojemnosc;
        this.kolor = kolor;
        this.model = model;
    }
}
