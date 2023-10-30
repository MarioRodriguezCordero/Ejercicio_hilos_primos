package org.example;

public class ComprobarPrimo {
    public static boolean comprobar(int numero) {
        for(int i = 2; i < numero; i++){
            if(numero%i == 0){
                return false;
            }
        }
        return true;
    }
}
