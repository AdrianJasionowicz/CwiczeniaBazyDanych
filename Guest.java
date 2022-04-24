package com.company;

public class Guest {
    private  String name;
    private  String meal;
    private  int phoneNumber;
    private  boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }
    public void displayGuestInfo() {
        System.out.println ("Imię: " + name);
        System.out.println ("Preferowany Posilek: " + meal);
        System.out.println ("Numer Telefonu: " + phoneNumber);
        String isVeganSt = isVegan ? "Tak" : "Nie";
        System.out.println ("Jest Weganinem ? " + isVeganSt);
    }
}
