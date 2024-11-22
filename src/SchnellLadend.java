public class SchnellLadend extends Zustand{

    private static SchnellLadend schnellLadend = new SchnellLadend();

    public SchnellLadend() {
    }

    @Override
    void bearbeiten(Ladegeraet ladegeraet) {
        int ladestand = ladegeraet.getLadestand();
        System.out.println("Ladestand: " + ladestand);

        if (ladestand >= 80) {
            ladegeraet.setZustand(NormalLadend.getNormalLadend());
        } else if (ladestand == 100) {
            ladegeraet.setZustand(NichtLadend.getNichtLadend());
        } else if (ladestand < 80) {
            ladegeraet.setZustand(SchnellLadend.getSchnellLadend());
        }

        System.out.println("Zustand: " + ladegeraet.getZustand().getClass().getSimpleName());

    }

    public static Zustand getSchnellLadend() {
        return schnellLadend;
    }
}
