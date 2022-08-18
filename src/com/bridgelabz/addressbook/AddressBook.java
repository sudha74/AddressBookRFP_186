package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        AddressBook1 add = new AddressBook1();
        Scanner scanner=new Scanner(System.in);
        boolean exist=true;
        do {
            System.out.println("Enter options:\n1) To add Contact\n2) To edit Contact\n3) To display Contacts\n4) To delete Contact\n5) To exit");
            int option =scanner.nextInt();
            switch (option){
                case 1:
                    add.addContact();
                    break;
                case 2:
                    add.editContact();
                    break;
                case 3:
                    add.displayContacts();
                    break;
                case 4:
                    add.deleteContact();
                    break;
                case 5:
                    exist=false;
                default:
                    break;
            }
        }while (exist);

    }
}
