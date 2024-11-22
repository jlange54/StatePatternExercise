public class NormalLadend extends Zustand {

    private static NormalLadend normalLadend = new NormalLadend();

    private NormalLadend() {
    }

    @Override
    void bearbeiten(Ladegeraet ladegeraet) {
        int ladestand = ladegeraet.getLadestand();
        System.out.println("Ladestand: " + ladestand);

        if (ladestand < 80) {
            ladegeraet.setZustand(SchnellLadend.getSchnellLadend());
        } else if (ladestand == 100) {
            ladegeraet.setZustand(NichtLadend.getNichtLadend());
        } else if (ladestand >= 80 && ladestand < 100) {
            ladegeraet.setZustand(NormalLadend.getNormalLadend());
        }

        System.out.println("Zustand: " + ladegeraet.getZustand().getClass().getSimpleName());

    }

    public static Zustand getNormalLadend() {
        return normalLadend;
    }
}
