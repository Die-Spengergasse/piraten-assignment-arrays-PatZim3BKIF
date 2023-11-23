package at.spengergasse;

public class Schiff {
    private int kanonen;
    private char typ;
    private Pirat kapitaen;

    private Pirat[] crew;
    private Pirat pirat1;
    private Pirat pirat2;
    private Pirat pirat3;
    private Pirat pirat4;
    private Pirat pirat5;

    /**
     * Constructor for objects of class Schiff
     */
    public Schiff(char typ) {
        setTyp(typ);
    }

    public void setTyp(char typ) {
        switch (typ) {
            case 's' -> {
                this.typ = typ;
                crew = new Pirat[2];
                kanonenKlarmachen(1);
            }
            case 'b' -> {
                this.typ = typ;
                crew = new Pirat[3];
                kanonenKlarmachen(2);
            }
            case 'f' -> {
                this.typ = typ;
                crew = new Pirat[4];
                kanonenKlarmachen(5);
            }
            case 'g' -> {
                this.typ = typ;
                crew = new Pirat[5];
                kanonenKlarmachen(8);
            }
            default ->
                    throw new IllegalArgumentException("Arrgh! Schaebige Schnigge vom Typ " + typ + " ist nicht würdig gesegelt zu werden!");
        }
    }

    public char getTyp() {
        return this.typ;
    }

    private void kanonenKlarmachen(int kanonen) {
        this.kanonen = kanonen;
    }

    public int getKanonen() {
        return this.kanonen;
    }

    public void anheuern(Pirat pirat) {

        if (kapitaen == null) {
            this.kapitaen = pirat;
            return;
        }
        for (int i = 0; i < crew.length; i++) {
            if (crew[i] == null) {
                crew[i] = pirat;
                return;
            }
        }
        throw new IllegalArgumentException("Kein Grog mehr fuer den Trunkenbold! Voll besetzt! " + typ);
    }

    public void print() {
        System.out.println(this);
    }

    public String toString() {
        String toReturn = "";

        switch (this.getTyp()) {
            case 's' -> toReturn = "Crew Schaluppe (3): " + "\n" + "______________________" + "\n";
            case 'b' -> toReturn = "Crew Brigg (4): " + "\n" + "______________________" + "\n";
            case 'f' -> toReturn = "Crew Fregatte (5): " + "\n" + "______________________" + "\n";
            case 'g' -> toReturn = "Crew Galeone (6): " + "\n" + "______________________" + "\n";
            default -> throw new IllegalArgumentException("Falsche Bezeichnung!");
        };
        toReturn += this.kapitaen.toString() + "\n";

        for (int i = 0; i < crew.length; i++) {
            toReturn += crew[i].toString() + "\n";
        }
        return toReturn;
    }
}