package com.mastermind;

import javax.swing.*;

public class Funciones {

    public static String generarAleatorio() {
        String code="";
        for (int i = 0; i < 5; i++) {
            code+=(int)(Math.random()*10)+"";
        }
        return code;
    }

    public static String pedirSecuencia(int intentos,Tablero tablero) {
        String sec="";
        do {
            sec= JOptionPane.showInputDialog(tablero.getCifraPista()+"\n! Adivina Codigo !  intentos: "+(intentos+1)+" de "+10);
            if (sec.length()!=5){
                JOptionPane.showMessageDialog(null,"Introduce ->5<- digitos");
            }
        } while (sec.length()!=5);
        return sec;
    }

    public static boolean comprobarSecuencia(String aleatorio, String secuencia) {
        if (aleatorio.equalsIgnoreCase(secuencia)){
            return true;
        }else {
            return false;
        }
    }

    public static String mostrarPista(String aleatorio, String secuencia) {
        String pista="";
        Boolean flag=false;
        for (int i = 0; i < 5; i++) {
            flag=false;
            if (aleatorio.charAt(i)==secuencia.charAt(i)){
                pista+="O";
            } else {
                for (int j = 0; j < 5; j++) {
                    if (secuencia.charAt(i)==aleatorio.charAt(j)){
                        flag=true;
                    }
                }
                if (flag){
                    pista+="X";
                }else {
                    pista+="-";
                }
            }
        }

        return pista;
    }

    public static void mostrar(String word) {
        JOptionPane.showMessageDialog(null,word);
    }
}
