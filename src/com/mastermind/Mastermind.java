package com.mastermind;

public class Mastermind {
    static private int intentos=0;
    static private boolean win=false;


    public static void main(String[] args) {

        Tablero table=Tablero.getInstance();
        table.setCifraAleatorio(Funciones.generarAleatorio());
        do {
            table.setCifraSecuencia(Funciones.pedirSecuencia(intentos,table));
            win=Funciones.comprobarSecuencia(table.getCifraAleatorio(), table.getCifraSecuencia());
            if (win){break;}
            table.setCifraPista(table.getCifraSecuencia(),Funciones.mostrarPista(table.getCifraAleatorio(), table.getCifraSecuencia()));
            Funciones.mostrar(table.getCifraPista());
            intentos++;
        } while (intentos<10);

        if (win){
            Funciones.mostrar("You WIN\nAdivinaste en "+(intentos+1)+" intentos");
        }else {
            Funciones.mostrar("GAME OVER");
        }
    }
}
