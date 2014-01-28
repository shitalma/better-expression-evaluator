package org.shitalma;


public class MultiplicationOperation implements Operation{

    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate()*right.evaluate();
    }
}
