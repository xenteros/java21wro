package com.github.xenteros;

import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {

        for (Nominal value : Nominal.values()) {
            System.out.println(value);
        }
    }
}
