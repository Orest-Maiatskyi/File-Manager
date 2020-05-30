package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        FileManager.fileCreate("C:\\Users\\orest\\Desktop\\Git\\test.txt");
        FileManager.fileEdit("C:\\Users\\orest\\Desktop\\Git\\test.txt", "some text here 2");
        FileManager.fileRead("C:\\Users\\orest\\Desktop\\Git\\test.txt", 100);
    }

}
