package main;

import classes.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCoppyConstructorRef {
    public static void main(String[] args) {

        Person before = new Person("Grace Hopper");

        /*List<Person> people = Stream.of(before)
                .collect(Collectors.toList());*/

        List<Person> people = Stream.of(before)
                .map(Person::new)
                .collect(Collectors.toList());

        Person after = people.get(0);

        assertFalse(before == after);
        assertEquals(before, after);

        before.setName("Rear Admiral Dr. Crace Murray Hopper");
        assertFalse(before.equals(after));
    }

    private static void assertEquals(Person person1, Person person2) {
        System.out.println(
                person1.equals(person2) ? "Equals" : "No Equals"
        );
    }

    private static void assertEquals(String name1, String name2) {

        System.out.println(
                name1.equals(name2) ? "Equals" : "No Equals"
        );
    }

    private static void assertTrue(boolean b) {

        System.out.println(b == true ? "True" : "False");
    }

    private static void assertFalse(boolean b) {
        System.out.println(b == false ? "False" : "True");
    }
}
