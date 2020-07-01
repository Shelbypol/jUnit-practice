import org.junit.Test;

import static org.junit.Assert.*;

public class jUnitPracticeTest {

    //    1)
    @Test
    public void testHelloWorld() {
        assertEquals("Returns 'Hello World'", "Hello World", jUnitPractice.helloWorld());
    }

    //    2)
    @Test
    public void testAddInt() {
        assertEquals("Returns correct sum", 2, jUnitPractice.addInt(1, 1));
    }

    //    3)
    @Test
    public void testIntToLong() {
        assertEquals("Check if int changed to long", 2147483647, jUnitPractice.intToLong(2147483647), 0);
    }

    //    4)
    @Test
    public void testNumericStringToDouble() {
        assertSame(9, jUnitPractice.numericStringToDouble("9"));
    }

    //    5)
    @Test
    public void testDoubleToFloat() {
        assertEquals(9.0, jUnitPractice.doubleToFloat(9), 0);
    }

    //    6)
    @Test
    public void testFirstChar() {
        assertEquals('t', jUnitPractice.firstChar("the"));
    }

    //  7)
    @Test
    public void testLastChar() {
        assertEquals('e', jUnitPractice.lastChar("the"));
    }

    //  8)
    @Test
    public void testCapFirst() {
        assertEquals('T', jUnitPractice.capFirst("the"));
    }

    //  9)
    @Test
    public void testSameFirstAndLast() {
        assertFalse(jUnitPractice.sameFirstAndLast("the"));
        assertTrue(jUnitPractice.sameFirstAndLast("hannah"));
    }

    //  10)
    @Test
    public void testSameCase(){
        assertTrue(jUnitPractice.sameCase("tHe", "tHe"));

    }

}
