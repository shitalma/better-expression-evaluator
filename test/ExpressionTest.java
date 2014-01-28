import org.junit.BeforeClass;
import org.junit.Test;
import org.shitalma.*;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @BeforeClass
    public static Expression e(double n) {
        return new Expression(n);
    }

    public static Expression e(Expression l, Expression r, Operation o) {
        return new Expression(l,r,o);
    }
    public static Operation add() {
        return new AdditionOperation();
    }
    public static Operation sub() {
        return new SubstractionOperation();
    }
    public static Operation mul() {
        return new MultiplicationOperation();
    }
    public static Operation div() {
        return new DivisionOperation();
    }
    public static Operation power() {
        return new PowerOfOperation();
    }

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

    @Test
    public void testPerformATreeOfExpression() throws Exception {
        Expression additionOf3and2 = e(e(3), e(2), add());
        Expression multiplication = e(e(additionOf3and2.evaluate()),e(4),mul());
        Expression finalResult = e(e(multiplication.evaluate()),(e(e(3),e(2),mul())),add());
        assertEquals(26d, finalResult.evaluate());
    }
}