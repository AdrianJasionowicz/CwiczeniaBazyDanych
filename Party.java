package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Party {

 private List<Guest> Guests = new ArrayList<>();
 private Set<String> meals = new HashSet<>();
 private Map<Integer, Guest> phoneToGuest = new HashMap<>();


Scanner scanner = new Scanner(System.in);

 public void addGuest() {
  System.out.println ("Podaj Imie Goscia:");
  String name = scanner.nextLine();
  System.out.println ("Podaj Preferowany posiłek");
  String meal = scanner.nextLine();
  System.out.println ("Podaj number telefonu");
  int phoneNumber = Integer.valueOf(scanner.nextLine());

  System.out.println ("Jesteś Weganinem? Y/N");
  String isVeganSt = scanner.nextLine();
  boolean isVegan;

   if (isVeganSt.equals("Y")) {
    isVegan = true;
   } else {
    isVegan = false;
   }
   Guest Guest = new Guest (name,meal,phoneNumber,isVegan);

   meals.add(meal);
   phoneToGuest.put(phoneNumber, Guest);
  Guests.add(Guest);

 }

  public void displayMeals() {
   for (String meal : meals) {
    System.out.println (meals);

   }

  }
    public void displayGuestPhoneNumber() {
     System.out.println ("Podaj Numer Telefonu: ");
     Integer phoneNumber = Integer.valueOf(scanner.nextLine());
     Guest guest = phoneToGuest.get(phoneNumber);

     guest.displayGuestInfo();
    }

 public void displayQuests() {
  for (Guest Guest : Guests) {
   Guest.displayGuestInfo();
  }
 }
}
