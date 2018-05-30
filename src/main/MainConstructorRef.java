package main;

import classes.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainConstructorRef {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Grace Hopper",
                "Barbara Liskov",
                "Ada Lovelace",
                "Karen Sparck Jones");
        System.out.println(names);

        /*List<classes.Person> people = names.stream()
                .map(name -> new classes.Person(name))
                .collect(Collectors.toList());
*/
        List<Person> people = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());

        System.out.println(people);
    }
}
