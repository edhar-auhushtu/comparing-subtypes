package com.ea;

import com.ea.fruit.Apple;
import com.ea.fruit.Fruit;
import com.ea.fruit.Orange;
import com.ea.person.Man;
import com.ea.person.Person;
import com.ea.person.Woman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Comparison of apples with oranges prohibited
        Orange orange1 = new Orange(1);
        Orange orange2 = new Orange(2);
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(2);
        List<Orange> oranges = Arrays.asList(orange1, orange2);
        List<Apple> apples = Arrays.asList(apple1, apple2);
        List<Fruit> fruits = Arrays.asList(apple1, orange2);

        assert Collections.max(oranges).equals(orange2);
        assert Collections.max(apples).equals(apple2);
//        assert Collections.max(fruits).equals(orange2);    compile-time error


        // Comparison of men with women allowed
        Man man1 = new Man(22);
        Man man2 = new Man(34);
        Woman woman1 = new Woman(21);
        Woman woman2 = new Woman(30);
        List<Man> men = Arrays.asList(man1, man2);
        List<Woman> women = Arrays.asList(woman1, woman2);
        List<Person> people = Arrays.asList(man1, woman2);

        assert Collections.max(men).equals(man2);
        assert Collections.max(women).equals(woman2);
        assert Collections.max(people).equals(woman2);
    }
}
