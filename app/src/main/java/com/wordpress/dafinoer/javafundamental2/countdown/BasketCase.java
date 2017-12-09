package com.wordpress.dafinoer.javafundamental2.countdown;

/**
 * Created by dafinoer on 09/12/17.
 */

public class BasketCase implements MatchImplt{
    @Override
    public Integer getPointThree(int value) {
        value +=3;
        return value;
    }

    @Override
    public Integer getPoIntFive(int value) {
        value += 5;
        return value;
    }
}
