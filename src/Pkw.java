// Klasse Pkw = Unterklasse
// extends = erweitert - Pkw erbt von Fahrzeug
// d.h. alle Unterklassen erben die Attribute der Oberklasse
public class Pkw extends Fahrzeug{
    private int anzahlSitze;

    // Konstruktor
    public Pkw(int anzahlSitze, int geschwindigkeit){
        // super = Konstruktor der nächsten Oberklasse aufrufen d.h. super = Attributwerte aus Oberklassenkonstruktor
        // in dem Fall "geschwindigkeit" aus der Oberklasse "Fahrzeug"
        // immer als Erstes vor this
        super(geschwindigkeit);

        // this = diese Klasse
        this.anzahlSitze = anzahlSitze;
        System.out.println("Konstruktor aus Pkw");
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }

    // Versuch alles auszugeben
    public void allesAusgeben(){
        // Anzahl Sitze möglich da in der gleichen Klasse
        System.out.println("Anzahl Sitze" + anzahlSitze);

        // Geschwindigkeit nicht möglich da nicht in der Klasse und private
        // System.out.println("Geschwindigkeit" + geschwindigkeit);

        // nur mit getGeschwindigkeit möglich da public
         System.out.println("Geschwindigkeit" + getGeschwindigkeit());

         /* wenn man private zu protected stellt, können die vererbten Unterklassen
            darauf zugreifen aber von außen wie bei public nicht */
    }
}
