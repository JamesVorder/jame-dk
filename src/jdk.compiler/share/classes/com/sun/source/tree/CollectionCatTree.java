package com.sun.source.tree;

public interface CollectionCatTree extends ExpressionTree {
    /**
     * Returns the left (first) operand of the expression.
     * @return the left operand
     */
    ExpressionTree getLeftOperand();

    /**
     * Returns the right (second) operand of the expression.
     * @return the right operand
     */
    ExpressionTree getRightOperand();
}
