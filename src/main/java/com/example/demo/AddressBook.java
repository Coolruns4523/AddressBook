package com.example.demo;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main (String[] args){
        Scanner scan = new Scanner((System.in));
        Person p;
        ArrayList<Person> persons = new ArrayList<>();
        String answer = "";

        boolean stop=false;


            do{

                p = new Person();

            System.out.println("Enter first name: ");
            p.setFirstName(scan.nextLine());

            System.out.println("Enter last name: ");
            p.setLastName(scan.nextLine());

            System.out.println("Enter address: ");
            p.setAddress(scan.nextLine());

            System.out.println("Enter phone number: ");
            p.setPhoneNumber(scan.nextLine());

            System.out.println("Enter email: ");
            p.setEmail(scan.nextLine());

            persons.add(p);

            for (Person eachPerson : persons) {
                System.out.println(eachPerson.getFirstName());

                System.out.println("Your contact have been saved");
                System.out.println("Would you like to enter another contact?");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no"))
                    stop = true;

            }
        }while(!stop);

        {
            System.out.println();
        }
        }
    }

