package com.github.xenteros;

import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {

        for (String arg : args) {
            try {
                int amount = Integer.parseInt(arg);
                System.out.println("Giving change for " + arg);
                printExchange(amount);
            } catch (RuntimeException e ) {
                System.out.println("Something went wrong!");
            }
        }

    }


    public static void printExchange(int amount) {
        if (amount % 10 != 0) {
            throw new RuntimeException();
        }

        Nominal[] values = Nominal.values();
        int pointer = 0;

        while (amount > 0) {
            if (values[pointer].getValue() <= amount) {
                System.out.println(values[pointer]);
                amount -= values[pointer].getValue();
            } else {
                pointer++;
            }
        }

    }
}
