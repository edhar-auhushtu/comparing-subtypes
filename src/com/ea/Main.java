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
        List<Orange> oranges = Arrays.asList(new Orange(1), new Orange(10));
        List<Apple> apples = Arrays.asList(new Apple(1), new Apple(10));
        List<Fruit> fruits = Arrays.asList(new Orange(1), new Apple(10));

        System.out.println(Collections.max(oranges));
        System.out.println(Collections.max(apples));
//        System.out.println(Collections.max(fruits));      compile-time error

        // Comparison of men with women allowed
        List<Man> men = Arrays.asList(new Man(24), new Man(56));
        List<Woman> women = Arrays.asList(new Woman(30), new Woman(21));
        List<Person> people = Arrays.asList(new Man(24), new Woman(21));

        System.out.println(Collections.max(men));
        System.out.println(Collections.max(women));
        System.out.println(Collections.max(people));
    }
}
