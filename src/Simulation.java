public class Simulation {

    public static void main(String[] args) {
        Ladegeraet ladegeraet = new Ladegeraet();

        ladegeraet.setLadestand(21);
        ladegeraet.ausloesen(); // Normal Ladend

        ladegeraet.setLadestand(22);
        ladegeraet.ausloesen(); // Schnell Ladend

        ladegeraet.setLadestand(80);
        ladegeraet.ausloesen(); // Normal Ladend

        ladegeraet.setLadestand(100);
        ladegeraet.ausloesen(); // Nicht Ladend
    }
}
