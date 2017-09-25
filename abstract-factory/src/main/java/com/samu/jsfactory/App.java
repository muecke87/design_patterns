package com.samu.jsfactory;

/**
 * Created by sandromuggli on 13.08.17.
 */
public class App {
    public static void main(String[] args) {
        Vinyl vinyl = VinylFactory.create(new Config("yellow", "paranoid", "black sabbath", "LP"));
        System.out.println(vinyl);

        // benötigt cast sofern man auf Subtype zugreifen möchte
        EP ep = (EP)VinylFactory.create(new Config("yellow", "paranoid", "black sabbath", "EP"));
        System.out.println(ep);
    }
}
