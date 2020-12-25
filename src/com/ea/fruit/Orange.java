package com.ea.fruit;

public class Orange extends Fruit implements Comparable<Orange> {

    public Orange(int size) {
        super("Orange", size);
    }

    @Override
    public int compareTo(Orange orange) {
        return super.compareTo(orange);
    }
}
