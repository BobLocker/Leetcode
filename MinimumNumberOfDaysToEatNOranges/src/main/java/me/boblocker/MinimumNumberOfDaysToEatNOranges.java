package me.boblocker;

import java.util.HashMap;

public class MinimumNumberOfDaysToEatNOranges {
    private HashMap<Integer, Integer> map = new HashMap<>();

    public int minDays(int n) {
        int res;

        if (n == 0)
            return 0;
        if (map.containsKey(n))
            return map.get(n);

        if (n % 6 == 0)
            res = Math.min(minDays(n / 2), minDays(n / 3));
        else if (n % 3 == 0)
            res = Math.min(minDays(n / 3), minDays(n - 1));
        else if (n % 2 == 0)
            res = Math.min(minDays(n / 2), minDays(n - 1));
        else
            res = minDays(n - 1);

        map.put(n, res + 1);
        return res + 1;
    }
}
