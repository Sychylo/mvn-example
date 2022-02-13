package org.example.mavenexample;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("E:/read.txt");
        File fileToWrite = new File("E:/write.txt");

        IOUtils.copy(new FileInputStream(file), new FileOutputStream(fileToWrite));

        System.out.println("You can try to open file")
    }

}
