package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
 boolean shouldEnd = true;
Party party = new Party();

  while(shouldEnd) {
      System.out.println ("Wybierz Opcje");
      System.out.println ("1. Wyswietl gosci ");
      System.out.println ("2 Dodaj Goscia");
      System.out.println ("3 wyswietl potrawy");
      System.out.println ("4 znajdz po numerze telefonu");
      System.out.println ("5 wyjscie");
        int useChoice = scanner.nextInt();

        switch (useChoice) {
            case 1:
                System.out.println ("Wybrano 1");
                party.displayQuests();
                break;
            case 2:
                System.out.println ("Wybrano 2");
                party.addGuest();
                break;
            case 3:
                System.out.println ("Wybrano 3");
                party.displayMeals();
                break;
            case 4:
                System.out.println ("Wybrano 4");
                party.displayGuestPhoneNumber();
                break;
            case 5:
                shouldEnd = false;

        }


  }


    }
}