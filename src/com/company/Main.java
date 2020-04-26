package com.company;
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Runner runner = new Runner (i, 1);
            runner.start();
            try {
                runner.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 4; i >= 1 ; i--) {
            Runner runner1 = new Runner(i, -1);
            runner1.start();
            try {
                runner1.join();
            } catch (InterruptedException e) {

            }
        }
    }
}