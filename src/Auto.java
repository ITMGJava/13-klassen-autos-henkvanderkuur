public class Auto {

//Maak variabelen in de klasse Auto

    int snelheid;
    String merk;
    int kilometerstand;
    int capaciteit;
    int verbruik;


//Maak methodes aan die voor alle te maken objecten in de klasse Auto gebruikt kunnen worden.

    void start() {
        System.out.println("De " + merk + " start.");
    }
    void stop() {
        System.out.println("De " + merk + " stopt.");
    }
    void geefGas() {
        snelheid += 20;
        kilometerstand += 20;
        System.out.println("De " + merk + " rijdt.");
    }

    int bereik() {
        return capaciteit * verbruik;
    }

    void setKilometerstand(int stand) {
        kilometerstand = stand;
    }
    int getKilometerstand() {
        return kilometerstand;
    }

    void setMerk (String merk) {
        this.merk = merk;
    }
    String getMerk() {
        return merk;
    }


    public static void main(String[] args) {

//Maak objecten auto1 en auto2 aan en geef ze eigen specifieke waarden voor de variabelen uit de klasse Auto.

        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        auto1.setMerk ("Toyota");
        auto1.snelheid = 100;
        auto1.capaciteit = 60;
        auto1.verbruik = 10;
        auto1.setKilometerstand(20000);

        auto2.setMerk ("Volvo");
        auto2.snelheid = 120;
        auto2.capaciteit = 80;
        auto2.verbruik = 12;
        auto2.setKilometerstand(45000);

        auto3.setMerk("Mercedes");
        auto3.setKilometerstand(10000);


//Geef de output weer van de methodes voor de aangemaakte objecten auto1 en auto2.

        auto1.start();
        auto1.stop();
        auto1.geefGas();
        System.out.println("De snelheid van de "+auto1.merk+" is "+auto1.snelheid+" Km/uur.");
        auto1.geefGas();
        System.out.println("De snelheid van de "+auto1.merk+" is "+auto1.snelheid+" Km/uur.");
        auto1.geefGas();
        System.out.println("De snelheid van de "+auto1.merk+" is "+auto1.snelheid+" Km/uur.");
        System.out.println("De kilometerstand van de "+auto1.merk+" is "+auto1.getKilometerstand()+" Km.");
        System.out.println("De "+auto1.merk+" heeft een actieradius van " +auto1.bereik()+" Km.");
        System.out.println();

        auto2.start();
        auto2.stop();
        auto2.geefGas();
        System.out.println("De snelheid van de "+auto2.merk+" is "+auto2.snelheid+" Km/uur.");
        auto2.geefGas();
        System.out.println("De snelheid van de "+auto2.merk+" is "+auto2.snelheid+" Km/uur.");
        auto2.geefGas();
        System.out.println("De snelheid van de "+auto2.merk+" is "+auto2.snelheid+" Km/uur.");
        System.out.println("De kilometerstand van "+auto2.merk+ " is nu "+auto2.kilometerstand+ " Km.");
        System.out.println();

        System.out.println("Het merk van de derde auto is " +auto3.getMerk());

    }
}