public class Main {
    public static void main(String[] args){
        // Objekterzeugung PKW
        Pkw p = new Pkw(8,120);
        // \n = new line = neuer Absatz beim Anzeigen
        System.out.println("Sitze:" + p.getAnzahlSitze() + "\n" + "Geschwindigkeit:" + p.getGeschwindigkeit());

        // kein Zugriff auf Geschwindigkeit möglich, da private:
        // p.geschwindigkeit;
    }
}