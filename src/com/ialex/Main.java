package com.ialex;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        FileSystem fs = new FileSystem();
        while (stdin.hasNext()) {
            String input = stdin.next();
            String[] split = input.split(" ");
            if (split.length <= 1) {
                System.out.println("Try again");
            } else {
                switch (split[0]) {
                    case "ls":
                        System.out.println(fs.listFiles(split[1]));
                        break;
                    case "rm":
                        fs.removeFile(split[1]);
                        break;
                    case "touch":
                        fs.addFile(split[1]);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
