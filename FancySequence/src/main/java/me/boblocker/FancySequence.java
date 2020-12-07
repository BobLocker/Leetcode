package me.boblocker;

import java.util.ArrayList;
import java.util.List;

public class FancySequence {
    public static final int MOD = 1000000007;
    private final List<Initial> initials = new ArrayList<>();
    private final Step[] operations = new Step[100000];
    private int stepsCount = 0;

    public FancySequence() {
    }

    public void append(int val) {
        initials.add(new Initial(val, stepsCount));
    }

    public void addAll(int inc) {
        if (!initials.isEmpty())
            operations[stepsCount++] = new Step(inc, Operation.ADD);
    }

    public void multAll(int m) {
        if (!initials.isEmpty())
            operations[stepsCount++] = new Step(m, Operation.MULT);
    }

    public int getIndex(int idx) {
        if (idx < 0 || idx >= initials.size())
            return -1;
        Initial init = initials.get(idx);

        int res = init.getVal();

        for (int i = init.getStep(); i < stepsCount; i++) {
            Step step = operations[i];
            Operation operation = step.getOperation();
            res = operation.execute(res, step.getVal());
        }

        init.setVal(res);
        init.setStep(stepsCount);
        initials.set(idx, init);

        return res;
    }
}
