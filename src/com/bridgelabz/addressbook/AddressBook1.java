package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook1 {
    Contacts contacts = new Contacts();
    Scanner scanner = new Scanner(System.in);

    void addContact() {
        System.out.println("Enter first name");
        contacts.setFirstName(scanner.next());
        System.out.println("Enter last name");
        contacts.setLastName(scanner.next());
        System.out.println("Enter city");
        contacts.setCity(scanner.next());
        System.out.println("Enter state");
        contacts.setState(scanner.next());
        System.out.println("Enter address :");
        scanner.nextLine();
        contacts.setAddress(scanner.nextLine());
        System.out.println("Enter zipCode");
        contacts.setZip(scanner.nextInt());
        System.out.println("Enter phone Number");
        contacts.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter email");
        contacts.setEmail(scanner.next());
    }

    Contacts display() {
        return contacts;

    }
}
