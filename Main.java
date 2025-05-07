public class Main {
    public static void main(String[] args) {
        LightBoard sim = new LightBoard(7, 5);

        System.out.println("LightBoard (T = on, F = off):");
        sim.printBoard();

        System.out.println("\nTest Cases:");
        System.out.println("sim.evaluateLight(0, 3): " + sim.evaluateLight(0, 3));
        System.out.println("sim.evaluateLight(6, 0): " + sim.evaluateLight(6, 0));
        System.out.println("sim.evaluateLight(4, 1): " + sim.evaluateLight(4, 1));
        System.out.println("sim.evaluateLight(5, 4): " + sim.evaluateLight(5, 4));
    }
}
