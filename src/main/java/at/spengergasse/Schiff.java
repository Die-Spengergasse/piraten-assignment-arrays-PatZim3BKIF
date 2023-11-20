package at.spengergasse;

public class Schiff {
    private int kanonen;
    private char typ;
    private Pirat kapitaen;
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
                kanonenKlarmachen(1);
            }
            case 'b' -> {
                this.typ = typ;
                kanonenKlarmachen(2);
            }
            case 'f' -> {
                this.typ = typ;
                kanonenKlarmachen(5);
            }
            case 'g' -> {
                this.typ = typ;
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
        switch (this.typ) {
            case 's' -> {
                if (kapitaen == null) {
                    this.kapitaen = pirat;
                } else if (pirat1 == null) {
                    this.pirat1 = pirat;
                } else if (pirat2 == null) {
                    this.pirat2 = pirat;
                } else {
                    throw new IllegalArgumentException("Kein Grog mehr fuer den Trunkenbold! Voll besetzt! " + typ);
                }
            }
            case 'b' -> {
                if (kapitaen == null) {
                    this.kapitaen = pirat;
                } else if (pirat1 == null) {
                    this.pirat1 = pirat;
                } else if (pirat2 == null) {
                    this.pirat2 = pirat;
                } else if (pirat3 == null) {
                    this.pirat3 = pirat;
                } else {
                    throw new IllegalArgumentException("Kein Grog mehr fuer den Trunkenbold! Voll besetzt! " + typ);
                }
            }
            case 'f' -> {
                if (kapitaen == null) {
                    this.kapitaen = pirat;
                } else if (pirat1 == null) {
                    this.pirat1 = pirat;
                } else if (pirat2 == null) {
                    this.pirat2 = pirat;
                } else if (pirat3 == null) {
                    this.pirat3 = pirat;
                } else if (pirat4 == null) {
                    this.pirat4 = pirat;
                } else {
                    throw new IllegalArgumentException("Kein Grog mehr fuer den Trunkenbold! Voll besetzt! " + typ);
                }
            }
            case 'g' -> {
                if (kapitaen == null) {
                    this.kapitaen = pirat;
                } else if (pirat1 == null) {
                    this.pirat1 = pirat;
                } else if (pirat2 == null) {
                    this.pirat2 = pirat;
                } else if (pirat3 == null) {
                    this.pirat3 = pirat;
                } else if (pirat4 == null) {
                    this.pirat4 = pirat;
                } else if (pirat5 == null) {
                    this.pirat5 = pirat;
                } else {
                    throw new IllegalArgumentException("Kein Grog mehr fuer den Trunkenbold! Voll besetzt! " + typ);
                }
            }
        }
    }

    public void print() {
        System.out.println(this);
    }

    public String toString() {
        return switch (this.getTyp()) {
            case 's' -> "Crew Schaluppe (3): " + "\n" + "______________________" + "\n" +
                    this.kapitaen.toString() + "\n" + this.pirat1.toString() + "\n" + this.pirat2.toString();
            case 'b' -> "Crew Schaluppe (3): " + "\n" + "______________________" + "\n" +
                    this.kapitaen.toString() + "\n" + this.pirat1.toString() + "\n" + this.pirat2.toString() + this.pirat3.toString();
            case 'f' -> "Crew Schaluppe (3): " + "\n" + "______________________" + "\n" +
                    this.kapitaen.toString() + "\n" + this.pirat1.toString() + "\n" + this.pirat2.toString() + "\n" + this.pirat3.toString() + "\n" + this.pirat4.toString();
            case 'g' -> "Crew Schaluppe (3): " + "\n" + "______________________" + "\n" +
                    this.kapitaen.toString() + "\n" + this.pirat1.toString() + "\n" + this.pirat2.toString() + "\n" + this.pirat3.toString() + "\n" + this.pirat4.toString() + "\n" + this.pirat5.toString();
            default -> throw new IllegalArgumentException("Falsche Bezeichnung!");
        };
    }
}