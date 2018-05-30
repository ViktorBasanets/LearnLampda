package main;

import classes.Person;

import java.util.Arrays;
import java.util.List;

public class MainConstrRefAndArrays {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Grace Hopper",
                "Barbara Liskov",
                "Ada Lovelace",
                "Karen Sparck Jones");

        Person[] people = names.stream()
                .map(Person::new)
                .toArray(Person[]::new);


    }
}
