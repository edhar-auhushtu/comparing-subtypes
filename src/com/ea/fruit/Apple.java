package com.ea.fruit;

public class Apple extends Fruit implements Comparable<Apple> {

    public Apple(int size) {
        super("Apple", size);
    }

    @Override
    public int compareTo(Apple apple) {
        return super.compareTo(apple);
    }
}
