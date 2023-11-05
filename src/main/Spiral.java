public class Spiral {
//    public static String toSpiral(String s) {
//        // complete solution
//        Integer charLength = (int) Math.ceil(Math.sqrt(s.length()));
//
//
//        return "";
//    }

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

            spiralArray[j] = new int[] {x, y};

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
