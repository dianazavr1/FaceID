package org.example;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        try {
            System.out.println("Pause for 2 seconds");
            Thread.sleep(5000);
            System.out.println("Resumed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

