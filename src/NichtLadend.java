public class NichtLadend extends Zustand{

    private static NichtLadend nichtLadend = new NichtLadend();

    private NichtLadend() {
    }

    @Override
    void bearbeiten(Ladegeraet ladegeraet) {
        System.out.println("Ladestand: " + ladegeraet.getLadestand());

        if (ladegeraet.getLadestand() >= 20 && ladegeraet.getLadestand() < 100) {
            ladegeraet.setZustand(NormalLadend.getNormalLadend());
        } else if (ladegeraet.getLadestand() <20){
            ladegeraet.setZustand(NichtLadend.getNichtLadend());
        }

        System.out.println("Zustand: " + ladegeraet.getZustand().getClass().getSimpleName());
    }

    public static Zustand getNichtLadend() {
        return nichtLadend;
    }
}
