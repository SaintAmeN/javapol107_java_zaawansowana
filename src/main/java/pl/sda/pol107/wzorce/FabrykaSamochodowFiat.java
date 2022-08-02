package pl.sda.pol107.wzorce;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
// Fabryka / factory
// Factory method (metody stworzeniowe)
// Abstract Factory
public abstract class FabrykaSamochodowFiat {
    public static SamochodFiat stworzFiata126p(){
        return new SamochodFiat("Maluszek", 0.6, "pomarańcz", "126p");
    }

    public static SamochodFiat stworzFiata125p(){
        return new SamochodFiat("Duży fiat", 0.8, "wiśnia", "125p");
    }
}
