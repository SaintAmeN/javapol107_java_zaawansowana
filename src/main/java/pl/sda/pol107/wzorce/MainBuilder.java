package pl.sda.pol107.wzorce;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
public class MainBuilder {
    public static void main(String[] args) {
        Student student = Student.builder()
                .imie("Paweł")
                .nazwisko("Gaweł")
                .build();

        Student student1 = Student.builder()
                .imieBabci1("Renia")
                .nazwisko("Gaweł")
                .średnia(4.0)
                .imie("Paweł")
                .imieBabci2("Zenia")
                .build();
    }
}
