import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator cal= new Calculator();

    @Test
    public void testAdd() {
        assertEquals(4,cal.add(2,2));
    }

    @Test
    public void testSub(){
        assertEquals(1,cal.sub(3,2));
    }

    @Test
    public void testDiv(){
        assertEquals(2,cal.div(4,2));
    }

    @Test
    public void testMul(){
        assertEquals(8,cal.multiply(4,2));
    }

    @Test
    public void testMinus(){
        assertEquals(2, cal.minus(4,2));
    }

    @Test
    public void testDivi(){
        assertEquals(4, cal.teDivi(8,2));
    }
    @Test
    public void testMul(){
        assertEquals(4,cal.teMul(2,2));
    }
}
