package org.example;

import org.example.ComprobarPrimo;

public class HiloPrimo extends Thread {
    private String nombre;
    private boolean bucle = true;
    private int numAleatorio;
    private long initialTime;

    public HiloPrimo(String nombre, long initialTime) {
        this.nombre = nombre;
        this.initialTime = initialTime;
    }

    @Override
    public void run(){
        try {
            while (bucle){
                numAleatorio = (int) Math.floor((Math.random() * 1000000) + 1);
                System.out.println("Este es el hilo " + nombre + " y el numero aleatorio es " + numAleatorio);
                if(ComprobarPrimo.comprobar(numAleatorio)){
                    bucle = false;
                }
                Thread.sleep(1000);
            }
            System.out.println("El hilo " + nombre + " ha tardado " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
