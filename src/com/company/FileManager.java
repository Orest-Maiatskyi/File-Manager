package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {

    public static void fileCreate(String path) {
        File newPath = new File(path);
        try {

            if (newPath.createNewFile()) { System.out.println("File created, dir: " + path); }
            else if (newPath.isDirectory()) { System.out.println("Missed file name"); }
            else if (newPath.exists()) { System.out.println("File already exists"); }

        } catch (Exception e) { System.err.println(e); }
    }

    public static void fileEdit(String path, String data) {
        File newPath = new File(path);
        try {

            if (!newPath.exists()) { System.out.println("File not exists"); }
            else {
                FileWriter newEdit = new FileWriter(newPath);
                newEdit.write(data);
                newEdit.close();
                System.out.println("File updated");
            }

        }catch (Exception e) { System.err.println(e); }
    }

    public static void fileRead(String path, int Characters) {
        File newPath = new File(path);

        try {

            if (!newPath.exists()) { System.out.println("File not exists"); }
            else {
                FileReader newRead = new FileReader(newPath);
                char [] data = new char[(int) newPath.length()];
                newRead.read(data);
                for (char i : data) {
                    System.out.print(i);
                }
            }

        }catch (Exception e) { System.err.println(e); }
    }

}
