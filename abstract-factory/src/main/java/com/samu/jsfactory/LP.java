package com.samu.jsfactory;

/**
 * Created by sandromuggli on 13.08.17.
 */
public class LP extends Vinyl {

    Integer diameter;

    public LP(Config config, Integer diameter) {
        super(config);
        this.diameter = diameter;
    }
}

