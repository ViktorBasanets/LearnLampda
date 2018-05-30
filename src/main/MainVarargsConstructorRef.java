package main;

import classes.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainVarargsConstructorRef {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Grace;Hopper",
                "Barbara;Liskov",
                "Ada;Lovelace",
                "Karen;Sparck;Jones");

        names.stream()
                .map(name -> name.split(";"))
                .map(Person::new)
                .collect(Collectors.toList());
    }
}
