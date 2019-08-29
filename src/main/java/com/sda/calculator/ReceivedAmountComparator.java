package com.sda.calculator;

import java.util.Comparator;

public class ReceivedAmountComparator implements Comparator<Entity> {
    public int compare(Entity e1, Entity e2) {
        if (e1.amountReceived() > e2.amountReceived()) {
            return 1;
        } else if (e1.amountReceived() == e2.amountReceived()) {
            return 0;
        } else {
            return -1;
        }
    }
}
