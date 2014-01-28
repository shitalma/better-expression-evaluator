package org.shitalma;

public class AdditionOperation implements Operation{

    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate() + right.evaluate();
    }
}
