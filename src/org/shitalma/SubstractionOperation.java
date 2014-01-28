package org.shitalma;


public class SubstractionOperation implements Operation{

    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate() - right.evaluate();
    }
}
