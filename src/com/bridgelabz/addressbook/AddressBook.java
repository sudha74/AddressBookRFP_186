package com.bridgelabz.addressbook;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        AddressBook1 add = new AddressBook1();
        add.addContact();
        System.out.println(add.display());
        add.editContact();
        System.out.println(add.display());
    }
}
