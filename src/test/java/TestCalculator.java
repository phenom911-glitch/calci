import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    Calculator cal= new Calculator();

    @Test
    public void addFuncTestSimple() {

        int result=cal.add(2, 2);
        if(result!=4) {
            Assert.fail();
        }
    }
}
