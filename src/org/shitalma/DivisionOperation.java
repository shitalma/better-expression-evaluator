package org.shitalma;

public class DivisionOperation implements Operation{
    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate() / right.evaluate();
    }
}
