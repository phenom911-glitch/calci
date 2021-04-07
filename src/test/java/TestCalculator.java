import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    Calculator cal= new Calculator();

    @Test
    public void testAdd() {

        int result=cal.add(2, 2);
        if(result!=4) {
            Assert.fail();
        }
    }

    @Test
    public void testSub(){
        int result = cal.sub(3,2);
        if(result != 1){
            Assert.fail();
        }
    }

    @Test
    public void testDiv(){
        int result = cal.div(4,2);
        if(result != 2){
            Assert.fail();
        }
    }
}
