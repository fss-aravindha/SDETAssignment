package com.fss.sdet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("./write.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        /* 
        File f=new File("./write.txt");
        Scanner sc=new Scanner(f);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

         * 
        */
        
    }

}
