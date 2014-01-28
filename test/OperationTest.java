import org.junit.Test;
import org.shitalma.*;

import static junit.framework.Assert.assertEquals;

public class OperationTest {

    @Test
    public void testAdditionOperation() throws Exception {
    AdditionOperation add = new AdditionOperation();
    double result = add.operate(new Expression(2d),new Expression(3d));
    assertEquals(5d,result);
    }

    @Test
    public void testSubstractionOperation() throws Exception {
        SubstractionOperation sub = new SubstractionOperation();
        double result = sub.operate(new Expression(2d),new Expression(3d));
        assertEquals(-1d,result);
    }

    @Test
    public void testMultiplicationOperation() throws Exception {
        MultiplicationOperation mul = new MultiplicationOperation();
        double result = mul.operate(new Expression(2d),new Expression(3d));
        assertEquals(6d,result);
    }

    @Test
    public void testDivisionOperation() throws Exception {
        DivisionOperation div = new DivisionOperation();
        double result = div.operate(new Expression(10d),new Expression(5d));
        assertEquals(2d,result);
    }

    @Test(expected = NullPointerException.class)
    public void testShouldThroughExceptionWhenDivideByZero() throws Exception {
        DivisionOperation div = new DivisionOperation();
        double result = div.operate(new Expression(10d),new Expression(0d));
        assertEquals(2d,result);
    }
}
