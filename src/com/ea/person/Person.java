package com.ea.person;

public abstract class Person implements Comparable<Person> {

    private final String sex;
    private final int age;

    protected Person(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (age != person.age) return false;
        return sex.equals(person.sex);
    }

    @Override
    public int hashCode() {
        int result = sex.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return sex + " (" + age + ")";
    }

    @Override
    /* Natural ordering used here is not consistent with equals:
    two people with different sex but the same age compare as the same,
    but they are not equal */
    public int compareTo(Person that) {
        return Integer.compare(this.age, that.age);
    }
}
