package com.bridgelabz.addressbook;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        Contacts contacts = new Contacts();
        contacts.setFirstName("Sudha");
        System.out.println(contacts.getFirstName());
    }
}
