package com.ea.fruit;

public abstract class Fruit {

    protected String name;
    protected int size;

    protected Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    protected int compareTo(Fruit that) {
        return Integer.compare(this.size, that.size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        if (size != fruit.size) return false;
        return name.equals(fruit.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return name + " (" + size + ")";
    }
}
