package org.example;

public class Main {
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();

        HiloPrimo hilo1 = new HiloPrimo("hilo1", initialTime);
        HiloPrimo hilo2 = new HiloPrimo("hilo2", initialTime);

        try {
            hilo1.start();
            hilo1.join();
            hilo2.start();
            hilo2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}