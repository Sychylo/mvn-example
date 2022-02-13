package org.example.mavenexample;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("E:/read.txt");
        File fileToWrite = new File("E:/write.txt");

        InputStream in = new FileInputStream(file);
        OutputStream out = new FileOutputStream(fileToWrite);

        byte[] bytes = in.readAllBytes();

        for (int i = 0; i < bytes.length; i++){
            out.write(bytes[i]);
        }

        System.out.println("You can try to open file");
    }

}