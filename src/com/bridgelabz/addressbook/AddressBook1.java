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

    void editContact() {
        System.out.println("Enter first name to edit");
        String firstName = scanner.next();
        if (firstName.equals(contacts.getFirstName())) {
            System.out.println("Edit the details of person");
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
        } else {
            System.out.println("Person not found");
        }

    }

    Contacts display() {
        return contacts;

    }
}
