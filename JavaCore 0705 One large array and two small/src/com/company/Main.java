package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

The commotion:
What kind of list is this?
1. Create a list of strings.
2. Add 5 different lines to it.
3. Display its size on the screen.
4. Using a loop, display its contents on the screen, each value from a new line.

Requirements:
1. The program should not read anything from the keyboard.
2. Declare a variable of type ArrayList (list of strings) and immediately initialize ee.
3. The program should add any 5 lines to the list using the add () method.
4. The program should display the size of the list on the screen.
5. The program should display the contents of the list on the screen, each value from a new line.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for(int i=0; i<5; i++) {
            strings.add(String.valueOf(i));
        }
        System.out.println(strings.size());
        for(String string : strings) {
            System.out.println(string);
        }
    }
}








