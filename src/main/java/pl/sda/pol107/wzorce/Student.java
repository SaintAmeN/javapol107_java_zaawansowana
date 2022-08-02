package pl.sda.pol107.wzorce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
@Data // Getter, Setter, EqualsAndHashCode, RequiredArgsConstructor, ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private long id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private double numerButa;
    private String imieMatki;
    private String imieOjca;
    private String imieBabci1;
    private String imieDziadka1;
    private String imieBabci2;
    private String imieDziadka2;
    private double średnia;

}
