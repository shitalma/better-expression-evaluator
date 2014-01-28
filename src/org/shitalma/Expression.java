package org.shitalma;

public class Expression {
    double value;
    Expression left,right;
    Operation operation;

    public Expression(double value) {
        this.value = value;
    }

    public Expression(Expression left, Expression right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    public double evaluate() {
        if(value==0)
         return operation.operate(left, right);
        return value;
    }
}
