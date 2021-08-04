package com.ialex;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while (stdin.hasNext()) {
            System.out.println(stdin.next());
        }
    }
}
