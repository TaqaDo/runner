package com.company;
public class Runner extends Thread {
    private int idPlayer;
    private int direction;

    public Runner(int idPlayer, int direction) {
        this.idPlayer = idPlayer;
        this.direction = direction;
    }

    public synchronized void run() {
        try {
            if (idPlayer < 5 && direction ==1) {
                System.out.println("Runner  "+idPlayer+" Берет палочку ");
                System.out.println("Runner  "+idPlayer+" Бежит к Runner  "+(idPlayer+1));
                sleep(5000);
            }
            if (idPlayer == 5 ) {
                System.out.println("Runner  "+idPlayer+" Берет палочку");
                System.out.println("Runner  "+idPlayer+" Бежит к финишу");
                sleep(5000);
                System.out.println("Runner  "+idPlayer+" Бежит к Runner  "+(idPlayer-1));

            }
            if (idPlayer > 1 && direction ==-1) {
                System.out.println("Runner  "+idPlayer+" Берет палочку");
                System.out.println("Runner  "+idPlayer+" Бежит к Runner  "+(idPlayer-1));
                sleep(5000);
            }
            if (idPlayer == 1 && direction ==-1) {
                System.out.println("Runner  "+idPlayer+" Берет палочку");
            }
        } catch (Exception e) {}
    }
}