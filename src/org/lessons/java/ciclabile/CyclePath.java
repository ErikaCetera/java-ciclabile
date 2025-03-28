package org.lessons.java.ciclabile;

import java.util.Arrays;

public class CyclePath {

    // inizializzazione di un array di interi e di un intero che rappresenta la
    // posizione
    private int[] integer;
    private int currentIndex;

    // costruttore che prende un array come parametro d'ingresso
    public CyclePath(int[] integer) {
        this.integer = integer;
        this.currentIndex = 0;
    }

    // costruttore senza parametri
    public CyclePath() {
        this.integer = new int[0];
        this.currentIndex = 0;

    }

    // Metodo che esegue il ciclo per stampare tutti gli elementi
    public void getElem() {
        if (integer != null) {
            for (int i = 0; i < integer.length; i++) {
                System.out.println(integer[i]);
            }
        }
    }

    // Metodo per verificare se siano presenti altri elemeti
    public boolean hasNextElem() {
        return currentIndex < integer.length;
    }

    // Metodo che restituisce l'elemento successivo
    public Object getNextElem() {
        if (hasNextElem()) {
            int elem = integer[currentIndex];
            currentIndex++;
            return elem;
        } else {
            return "Non ci sono altri elementi!";
        }
    }

    // Metodo per aggiungere un nuovo elemento all'array
    public void addElem(int element) {
        // nuovo array con lungezza maggiore
        int[] newArray = new int[integer.length + 1];

        // copia gli elementi
        for (int i = 0; i < integer.length; i++) {
            newArray[i] = integer[i];
        }

        // aggiunge un nuovo elemento
        newArray[integer.length] = element;

        // aggiorna l'array iniziale
        this.integer = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(integer);

    }

}
