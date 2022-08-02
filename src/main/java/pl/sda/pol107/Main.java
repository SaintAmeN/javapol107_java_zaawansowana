package pl.sda.pol107;

import pl.sda.pol107.ptaszki.Kukułka;
import pl.sda.pol107.ptaszki.Ptak;
import pl.sda.pol107.wzorce.FabrykaSamochodowFiat;
import pl.sda.pol107.wzorce.SamochodFiat;

import java.util.*;

/**
 * @author Paweł Recław, AmeN
 * @project java_pol107_demo
 * @created 02.08.2022
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 5;

        // Paradygmat - Przyjęte odgórnie zasady w dziedzinie (programowania obiektowego)
        // hermetyzacja / enkapsulacja  - stosuj jak najbardziej restrykcyjne modyfikatory dostępu,
        // dziedziczenie                - jeśli widzisz wspólne zachowania lub cechy obiektów stwórz (wyższe) warstwy abstrakcji by je odziedziczyć,
        // polimorfizm                  - po lewej stronie przypisania stosuj typ odziedziczony + (wielopostaciowość metod)
            // poli         - wielo
            // morfizm      - postaciowość
        // abstrakcja                   - twórz uproszczony model świata rzeczywistego

        // SOLID -
        // Cel:
        //      - ujednolicenie kodu
        //      - stworzyć kod łatwy/tani w utrzymaniu
        //      - stworzyć kod który w łatwy sposób możemy rozwijać

        // S - Single responsibility        - metody i klasy były odpowiedzialne za wykonanie jednego zadania
        //                                      - metoda robi jedną rzecz - łatwo się testuje
        //                                      - jeśli uszkodzę jedną rzecz, to naprawiam jedną klasę/metodę
        //                                      - jeśli nad czymś pracuję to mam jeden powód do zaglądania do konkretnego pliku
        //                  Klasa = 5 rzeczy - naprawiając 1/5 rzeczy narażam 5 rzeczy na uszkodzenie.
        // O - Open close principle         - kod powinien być otwarty na rozszerzenia i zamknięty na zmiany
        //                                      - kod powinien być rozszerzalny jeśli chcę dodać funkcjonalność
        //                                      - dodanie funkcjonalności nie powinno się wiązać z edycją istniejącego kodu
        // L - Liskov substitution          - po lewej stronie przypisania stosuj typ nadrzędny pozwalający dalej realizować naszą funkcjonalność
        //
        // I - Interface segregation        - twórz interfejsy i segreguj je aby zawsze implementować ich wszystkie metody (a nie wybiórczo
        // D - Dependency Inversion (Dependency Injection) (architektura)

        int[] tab;
        // Tablica

        // Kolekcja dziedziczy po Collection (poniżej kategorie == interfejsy)
        // Lista -
        //              - ArrayList
        //              - LinkedList   (Queue / Kolejka)
        //              - Vector...         - vector jest super-starą implementacją listy która jest bezpieczna wielowątkowo
        // Set   -                      - nie ma kolejności, elementy nie są uporządkowane, nie ma duplikatów (tylko unikalne)
        //              - HashSet           - -||-
        //              - LinkedHashSet     - elementy są uporządkowane z kolejnością wstawiania
        //              - TreeSet           - elementy są uporządkowane zgodnie z kolejnością sortowania (Comparator)
        // Mapa  -                      - posiadamy pary klucz-wartość, elementy nie są uporządkowane, klucz się nie może powtórzyć
        //              - HashMap           - -||-
        //              - LinkedHashMap     - elementy są uporządkowane z kolejnością wstawiania
        //              - TreeMap           - klucze są uporządkowane zgodnie z kolejnością sortowania (Comparator)

//        SamochodFiat fiacik = new SamochodFiat("moj fiat", 10.0, "wiśnia", "ferrari");
        SamochodFiat fiat = FabrykaSamochodowFiat.stworzFiata125p();
    }
}
