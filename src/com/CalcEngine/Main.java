package com.CalcEngine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input path of the file you want to read");
        String file = in.nextLine();
        readFile(file);
    }

        private static void readFile(String f) {
            BufferedReader reader = null;
            String line;
            try {
                reader = new BufferedReader(new FileReader(f));
                try {
                    while ((line = reader.readLine()) != null)
                        if(line.startsWith("C")){
                        System.out.println(line);
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                try{
                if(reader != null) {
                    reader.close();}
                } catch(Exception e){
                    e.printStackTrace();
                    }
            }
        }
    }




