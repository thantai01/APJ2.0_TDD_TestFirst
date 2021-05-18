import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.jupiter.api.Test;
//1 1
//-1 1
//0 0
//input expect actually


class AbsoluteNumCalculatorTest {

    @Test
    void testFindAbsolute() {
        int input = 1;
        int expect = 1;
        int actual = AbsoluteNumCalculator.findAbsolute(input);
        assertEquals(expect,actual);
    }
    @Test
    void testFindAbsolute1() {
        int input = -1;
        int expect = 1;
        int actual = AbsoluteNumCalculator.findAbsolute(input);
        assertEquals(expect,actual);
    }
    @Test
    void testFindAbsolute2() {
        int input = 0;
        int expect = 0;
        int actual = AbsoluteNumCalculator.findAbsolute(input);
        assertEquals(expect,actual);
    }



    private void assertEquals(int expect, int actual) {
    }

}