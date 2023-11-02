package org.courses.ex3_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static final String FILE_PATH = "./Text.txt";

    public static void main(String[] args) throws IOException {

        Path pathToFile = Paths.get(FILE_PATH)  ;
        Files.write(pathToFile, (" Hello world. My name is Kateryna. " +
                "I'm learning java language now.\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        try (
                BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(FILE_PATH)
                             )
                     )
        ) {
            reader.lines().forEach(l -> System.out.println(l));
        }

    }
}
