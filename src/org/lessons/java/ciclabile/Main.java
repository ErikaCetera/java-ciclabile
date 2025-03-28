package org.lessons.java.ciclabile;

public class Main {
public static void main(String[] args) {

    int[] integer = {1, 2, 3};

 CyclePath Cycle = new CyclePath(integer);
 CyclePath Cycle1 = new CyclePath();
 
   
 
    System.out.println("Elemento: " + Cycle.getNextElem());
    System.out.println("Ci sono ancora elementi? " + Cycle.hasNextElem());
    System.out.println("Elemento: " + Cycle.getNextElem());
    System.out.println("Ci sono ancora elementi? " + Cycle.hasNextElem());
    System.out.println("Elemento: " + Cycle.getNextElem());
    System.out.println("Ci sono ancora elementi? " + Cycle.hasNextElem());
    System.out.println( Cycle.getNextElem());
    
    Cycle1.addElem(2);
    System.out.println(Cycle1);
    Cycle1.addElem(2);
    System.out.println(Cycle1);
    Cycle1.addElem(2);
    System.out.println(Cycle1);




    
    
   
   
 
    
}
}
