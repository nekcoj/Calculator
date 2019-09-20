package com.company;

import java.util.Scanner;

public class Calc {
    private double[] tal = new double[3];

    public Calc() {

    }

    public void menu() {
        //Metod som skriver ut "startmeny" och läser in menyval från tangentbordet.
        Scanner scan = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.printf("%n1:Addera%n");
        System.out.printf("%n2:Subtrahera%n");
        System.out.printf("%n3:Dividera%n");
        System.out.printf("%n4:Multiplicera%n");
        System.out.printf("%n5:Avsluta%n");
        System.out.print("Ange ditt val: ");
        int menyVal = scan.nextInt();
        switch (menyVal) {
            case 1:
                mataTal();
                add();
                break;
            case 2:
                mataTal();
                sub();
                break;
            case 3:
                mataTal();
                div();
                break;
            case 4:
                mataTal();
                mul();
                break;
            case 5:
                break;
            default:
                System.out.println("Inget giltigt val! Försök igen!");
                menu();
        }
    }

    public void mataTal() {
        //Metod för att mata in 2 flyttal.
        Scanner scan = new Scanner(System.in);
        System.out.print("Ange tal 1: ");
        tal[0] = scan.nextDouble();
        System.out.printf("%nAnge tal 2: ");
        tal[1] = scan.nextDouble();
    }
    public void add() {
        //Metod för att addera de inmatade talen i vektorn
        // och lägga in resultatet på sista platsen i vektorn.
        tal[2] = tal[0] + tal[1];
        printResultat();
    }
    public void sub(){
        //Metod för att subtrahera de inmatade talen i vektorn
        // och lägga in resultatet på sista platsen i vektorn.
        tal[2] = tal[0] - tal[1];
        printResultat();
    }
    public void div(){
        //Metod för att dividera de inmatade talen i vektorn
        // och lägga in resultatet på sista platsen i vektorn.
        if(tal[1] == 0){
            System.out.println("Nämnaren får ej vara 0.");
            menu();
        } else {
            tal[2] = tal[0] / tal[1];
            printResultat();
        }
    }
    public void mul(){
        //Metod för att multiplicera de inmatade talen i vektorn
        // och lägga in resultatet på sista platsen i vektorn.
        tal[2] = tal[0] * tal[1];
        printResultat();
    }
    public void printResultat(){
        //Metod för att skriva ut resultatet av senaste uträkningen.
        System.out.printf("Reslutat: %f%n", tal[2]);
        menu();
    }
}

