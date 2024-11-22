public class Ladegeraet {

    private Zustand zustand;
    private int ladestand;

    public Ladegeraet() {
        this.zustand = NichtLadend.getNichtLadend();
    }

    public void setZustand(Zustand zustand) {
        this.zustand = zustand;
    }

    public Zustand getZustand() {
        return zustand;
    }

    public int getLadestand() {
        return ladestand;
    }

    public void setLadestand(int ladestand) {
        this.ladestand = ladestand;
    }

    public void ausloesen() {
        zustand.bearbeiten(this);
    }
}
