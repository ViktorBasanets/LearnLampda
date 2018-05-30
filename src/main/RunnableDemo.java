package main;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(
                        "inside runnable using an anonymous inner class");
            }
        }).start();

        new Thread(() -> System.out.println(
                "inside Thread constructor using lambda")).start();

        Runnable reference = () -> System.out.println(
                "lambda expression implementing the run method");
        new Thread(reference).start();

        File directory = new File("./src/main");
        String[] names = directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
        System.out.println(Arrays.asList(names));
    }
}
