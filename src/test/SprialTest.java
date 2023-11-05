import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SprialTest {

    @Test
    public void arrayBuilder() {
        int[][] expectedArray = new int[][] {{0,0},{1,0},{2,0},{2,1},{2,2},{1,2},{0,2},{0,1},{1,1}};
        int[][] actualArray = Spiral.arrayBuilder(3);

        for (int i = 0; i < expectedArray.length; i++) {
            assertArrayEquals(expectedArray[i], actualArray[i]);
        }
    }
}