import java.util.Scanner;

public class Auto {
    int snelheid = 0;
    String merk = "Toyota";
    int kilometerstand = 23000;


    void start() {
        System.out.println("De Toyota start.");
    }
    void stop() {
        System.out.println("De Toyota stopt.");
    }
    void geefGas() {
        System.out.println("De Toyota rijdt.");
    }
    int getKilometerstand() {
        System.out.println("De kilometerstand van de Toyota is: "+kilometerstand+ "kilometer.");
        return kilometerstand;
    }
    void setKilometerstand(int stand) {
        System.out.println("De kilometerstand van de Toyota is: "+stand+ "kilometer.");
    }
    void setMerk (String merk){
        System.out.println("Het merk van de auto is: "+merk);
    }


    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.start();
        auto1.stop();
        auto1.geefGas();
        auto1.getKilometerstand();

        Auto auto2 = new Auto();
        auto2.start();
        auto2.stop();
        auto2.geefGas();
        auto2.setKilometerstand(50000);

        Auto auto3 = new Auto();
        auto3.setMerk("Volvo");
        auto3.setKilometerstand(10000);
    }
}

