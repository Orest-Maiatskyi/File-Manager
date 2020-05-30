package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        FileManager.fileCreate("path");
        FileManager.fileEdit("path", "content");
        FileManager.fileRead("path", 100);
    }

}
