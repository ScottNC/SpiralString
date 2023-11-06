import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SprialTest {

    @Test
    public void test0() {
        assertEquals("Hel\n"+
                "  l\n"+
                " !o", Spiral.toSpiral("Hello!"));
    }

    @Test
    public void test1() {
        assertEquals("Str\n"+
                "Exi\n"+
                " gn", Spiral.toSpiral("String Ex"));
    }
    @Test
    public void test2() {
        assertEquals("sampl\n"+
                " Gooe\n"+
                "s  d \n"+
                "t   t\n"+
                "i tse", Spiral.toSpiral("sample test its Good"));
    }

    @Test
    public void arrayBuilder() {
        int[][] expectedArray = new int[][] {{0,0},{0,1},{0,2},{1,2},{2,2},{2,1},{2,0},{1,0},{1,1}};
        int[][] actualArray = Spiral.arrayBuilder(3);

        for (int i = 0; i < expectedArray.length; i++) {
            assertArrayEquals(expectedArray[i], actualArray[i]);
        }
    }
}