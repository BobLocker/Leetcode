package me.boblocker;

public class Step {
    private int val;
    private Operation operation;

    public Step(int val, Operation operation) {
        this.val = val;
        this.operation = operation;
    }

    public int getVal() {
        return val;
    }

    public Operation getOperation() {
        return operation;
    }
}
