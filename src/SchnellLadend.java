public class SchnellLadend extends Zustand{

    private static SchnellLadend schnellLadend = new SchnellLadend();

    public SchnellLadend() {
    }

    @Override
    void bearbeiten(Ladegeraet ladegeraet) {
        System.out.println("Ladestand: " + ladegeraet.getLadestand());

        if (ladegeraet.getLadestand() >= 80) {
            ladegeraet.setZustand(NormalLadend.getNormalLadend());
        } else if (ladegeraet.getLadestand() == 100) {
            ladegeraet.setZustand(NichtLadend.getNichtLadend());
        } else if (ladegeraet.getLadestand() < 80) {
            ladegeraet.setZustand(SchnellLadend.getSchnellLadend());
        }

        System.out.println("Zustand: " + ladegeraet.getZustand().getClass().getSimpleName());

    }

    public static Zustand getSchnellLadend() {
        return schnellLadend;
    }
}
