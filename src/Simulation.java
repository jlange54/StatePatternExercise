public class Simulation {

    public static void main(String[] args) {

        ausloesen(21);  // Normal Ladend
        ausloesen(22);  // Schnell Ladend
        ausloesen(80);  // Normal Ladend
        ausloesen(100); // Nicht Ladend
    }

    private static void ausloesen (int ladestand) {
        Ladegeraet ladegeraet = new Ladegeraet();
        ladegeraet.setLadestand(ladestand);
        ladegeraet.ausloesen();
        System.out.println("--------------------------------");
    }
}
