public class NichtLadend extends Zustand{

    private static NichtLadend nichtLadend = new NichtLadend();

    private NichtLadend() {
    }

    @Override
    void bearbeiten(Ladegeraet ladegeraet) {
        int ladestand = ladegeraet.getLadestand();
        System.out.println("Ladestand: " + ladestand);

        if (ladestand >= 20 && ladestand < 100) {
            ladegeraet.setZustand(NormalLadend.getNormalLadend());
        } else if (ladestand <20){
            ladegeraet.setZustand(NichtLadend.getNichtLadend());
        }

        System.out.println("Zustand: " + ladegeraet.getZustand().getClass().getSimpleName());
    }

    public static Zustand getNichtLadend() {
        return nichtLadend;
    }
}
