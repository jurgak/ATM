package com.company;

import java.util.Scanner;

public class Main {

    static int balanceMain = 1000;
    static int pinCodeMain = 1234;

    public static void main(String[] args) {
        boolean b1 = enterPin();
        if (b1) {
            mainMenu();
        } else {
            System.out.println("Wrong pin code");
        }
    }

    static boolean enterPin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pin code: ");
        int pinCode = input.nextInt();
        return pinCode == pinCodeMain;
    }

    static void mainMenu() {
        Scanner input = new Scanner(System.in);
        int operation = selectOperation(input);
        switch (operation) {
            case 1:
                displayBalance();
                break;
            case 2:
                takeOutMoney();
                break;
            case 3:
                deposit();
                break;
            case 0:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    static void displayBalance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 - display on screen");
        System.out.println("Press 2 - print on paper");
        System.out.println("Enter your choice: ");
        int screenPaper = input.nextInt();
        switch (screenPaper) {
            case 1:
                System.out.println("Your current balance is: " + balanceMain + " EUR");
                break;
            case 2:
                System.out.println("The planet is out of trees, no paper for you today");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    static void takeOutMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you would like to withdraw");
        int withdraw = input.nextInt();
        System.out.println((withdraw <= balanceMain) ?
                ("Please take your money: " + withdraw + " EUR") :
                ("Insufficient funds. Your balance is " + balanceMain + " EUR"));
        if (withdraw <= balanceMain) {
            System.out.println("Remaining balance: " + (balanceMain - withdraw) + " EUR");
        }
    }

    static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you would like to deposit: ");
        int deposit = input.nextInt();
        System.out.println(deposit + " EUR is transferred to your account");
    }

    static int selectOperation(Scanner input) {
        System.out.println("Press 1 - account balance");
        System.out.println("Press 2 - money withdrawal");
        System.out.println("Press 3 - money deposit");
        System.out.println("Press 0 - exit");
        System.out.println("Enter your choice: ");
        return input.nextInt();
    }

}