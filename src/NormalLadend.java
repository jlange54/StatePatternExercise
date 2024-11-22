public class NormalLadend extends Zustand {

    private static NormalLadend normalLadend = new NormalLadend();

    private NormalLadend() {
    }

    @Override
    void bearbeiten(Ladegeraet ladegeraet) {
        System.out.println("Ladestand: " + ladegeraet.getLadestand());

        if (ladegeraet.getLadestand() < 80) {
            ladegeraet.setZustand(SchnellLadend.getSchnellLadend());
        } else if (ladegeraet.getLadestand() == 100) {
            ladegeraet.setZustand(NichtLadend.getNichtLadend());
        } else if (ladegeraet.getLadestand() >= 80 && ladegeraet.getLadestand() < 100) {
            ladegeraet.setZustand(NormalLadend.getNormalLadend());
        }

        System.out.println("Zustand: " + ladegeraet.getZustand().getClass().getSimpleName());

    }

    public static Zustand getNormalLadend() {
        return normalLadend;
    }
}
