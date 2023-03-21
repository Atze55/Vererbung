// Klasse Fahrzeug = Oberklasse vererbt alles an die Unterklassen
public class Fahrzeug {
    private int geschwindigkeit;

    // Konstruktor
    public Fahrzeug(int geschwindigkeit){
        this.geschwindigkeit = geschwindigkeit;
        System.out.println("Konstruktor aus Fahrzeug");
    }
    // Getter
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
    //Setter
    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }


}
