package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] nameParts = new String[4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine();

        nameParts = fullName.trim().split(" ");

        StringBuilder nameInitial = new StringBuilder();

        for (int i=0; i<nameParts.length; i++){
            String namePart = nameParts[i].substring(0,1).toUpperCase();
            if (i == nameParts.length-1){
                nameInitial.append(namePart);
            }
            else{
                nameInitial.append(namePart).append(".");
            }
        }

        System.out.println("Your Name Initials are : " + nameInitial.toString());
    }
}