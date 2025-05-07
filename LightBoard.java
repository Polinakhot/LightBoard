import java.util.Random;

public class LightBoard {
    private boolean[][] lights;

    /**
     * Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        Random rand = new Random();
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                lights[row][col] = rand.nextDouble() < 0.4;
            }
        }
    }

    /**
     * Evaluates a light in row index row and column index col
     * and returns a status as described:
     * - If the light is on and the number of on-lights in its column is even, return false.
     * - If the light is off and the number of on-lights in its column is divisible by 3, return true.
     * - Otherwise, return the light's current status.
     */
    public boolean evaluateLight(int row, int col) {
        int onCount = 0;
        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col]) {
                onCount++;
            }
        }

        if (lights[row][col] && onCount % 2 == 0) {
            return false;
        } else if (!lights[row][col] && onCount % 3 == 0) {
            return true;
        } else {
            return lights[row][col];
        }
    }

    // Method to print the light board for testing purposes
    public void printBoard() {
        for (boolean[] row : lights) {
            for (boolean light : row) {
                System.out.print((light ? "T" : "F") + " ");
            }
            System.out.println();
        }
    }

    // Getter (for testing specific values)
    public boolean[][] getLights() {
        return lights;
    }
}