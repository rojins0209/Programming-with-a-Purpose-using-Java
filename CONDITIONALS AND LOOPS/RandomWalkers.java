import java.util.Random;

public class RandomWalkers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments: r (Manhattan distance) and trials (number of trials).");
            return;
        }

        // Parse the command-line arguments
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        double totalSteps = 0;

        // Perform the trials
        for (int t = 0; t < trials; t++) {
            totalSteps += randomWalk(r);
        }

        // Calculate the average number of steps
        double averageSteps = totalSteps / trials;

        // Print the result
        System.out.printf("average number of steps = %.5f\n", averageSteps);
    }

    // Method to simulate a single random walk
    private static int randomWalk(int r) {
        int x = 0, y = 0, steps = 0;
        Random random = new Random();

        // Walk until the Manhattan distance is greater than or equal to r
        while (Math.abs(x) + Math.abs(y) < r) {
            int direction = random.nextInt(4); // Random direction (0 = North, 1 = East, 2 = South, 3 = West)

            // Move based on the random direction
            switch (direction) {
                case 0: y++; break;  // Move North
                case 1: x++; break;  // Move East
                case 2: y--; break;  // Move South
                case 3: x--; break;  // Move West
            }
            steps++;
        }
        return steps;
    }
}
