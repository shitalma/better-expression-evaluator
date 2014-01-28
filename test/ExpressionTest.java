import org.junit.Test;
import org.shitalma.*;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testAdditionOfTwoOperands() throws Exception {
        Expression expression = new Expression(new Expression(1d),new Expression(1d),new AdditionOperation());
        assertEquals(2d, expression.evaluate());
    }

    @Test
    public void testSubstractionOfTwoOperands() throws Exception {
        Expression expression = new Expression(new Expression(4d),new Expression(1d),new SubstractionOperation());
        assertEquals(3d, expression.evaluate());
    }

    @Test
    public void testMultiplcationOfTwoOperands() throws Exception {
        Expression expression = new Expression(new Expression(4d),new Expression(1d),new MultiplicationOperation());
        assertEquals(4d, expression.evaluate());
    }

    @Test
    public void testDivisionOfTwoOperands() throws Exception {
        Expression expression = new Expression(new Expression(10d),new Expression(2d),new DivisionOperation());
        assertEquals(5d, expression.evaluate());
    }
}