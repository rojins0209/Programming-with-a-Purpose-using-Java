import java.util.Random;

public class RandomWalker {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter at least a single distance.");
            return;
        }
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, step = 0;

        System.out.println("(" + x + "," + y + ")");
        Random random = new Random();
        while (Math.abs(x) + Math.abs(y) < r) {
            int direction = random.nextInt(4);

            switch (direction) {
                case 0: y++; break;
                case 1: x++; break;
                case 2: y--; break;
                case 3: x--; break;
            }
            System.out.println("(" + x + "," + y + ")");
            step++;
        }
        System.out.println("steps = " + step);
    }
}
