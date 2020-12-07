package me.boblocker;

public enum Operation {
    ADD{
        @Override
        int execute(int val1, int val2) {
            long temp = (long) val1 + (long) val2;
            temp %= FancySequence.MOD;
            return (int) temp;
        }
    },
    MULT {
        @Override
        int execute(int val1, int val2) {
            long temp = (long) val1 * (long) val2;
            temp %= FancySequence.MOD;
            return (int) temp;
        }
    };

    abstract int execute(int val1, int val2);
}
