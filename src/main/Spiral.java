import java.util.stream.IntStream;
import java.util.Arrays;

public class Spiral {
    public static String toSpiral(String s) {

        int charLength = (int) Math.ceil(Math.sqrt(s.length()));

        int [][] spiralArray = arrayBuilder((charLength));

        String[] spiral = new String[charLength];
        Arrays.fill(spiral, " ".repeat(charLength));

        IntStream.range(0, s.length())
                .forEach(i -> {
                    int y = spiralArray[i][0];
                    int x = spiralArray[i][1];
                    String c = spiral[y];
                    spiral[y] = c.substring(0, x) + s.charAt(i) + c.substring(x + 1);
                });

        return String.join("\n", spiral);
    }

    public static int[][] arrayBuilder (int i) {
        int j = 0;

        int lowerBoundX = 0;
        int lowerBoundY = 0;

        int upperBoundX = i-1;
        int upperBoundY = i-1;

        int x = 0;
        int y = 0;

        int dx = 1;
        int dy = 0;

        int[][] spiralArray = new int[i*i][2];

        while (j < i*i) {

            spiralArray[j] = new int[] {y, x};

            if (x == upperBoundX && dx == 1) {
                dx = 0;
                dy = 1;
                lowerBoundY++;
            } else if (y == upperBoundY && dy == 1) {
                dx = -1;
                dy = 0;
                upperBoundX--;
            } else if (x == lowerBoundX && dx == -1) {
                dx = 0;
                dy = -1;
                upperBoundY--;
            } else if (y == lowerBoundY && dy == -1) {
                dx = 1;
                dy = 0;
                lowerBoundX++;
            }

            x += dx;
            y += dy;

            j++;
        }

        return spiralArray;
    }
}
