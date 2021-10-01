package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operation = selectOperation(input);
        if (operation == 1) {
            displayBalance();
        }
        if (operation == 2) {
            takeOutMoney();
        }
        if (operation == 3) {
            deposit();
        }
    }

    static int displayBalance() {
        int balance = 1000;
        System.out.println("Current Balance : " + balance);
        System.out.println();
        return balance;
    }

    static void takeOutMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose amount you would like to withdraw");
        int sum = input.nextInt();
        System.out.println((sum <= displayBalance()) ? ("Take money. SUM:" + sum + "EUR") : ("Insufficient balance"));
    }

    static void deposit() {
        int temp;
        int balance = displayBalance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        temp = input.nextInt();
        balance = balance + temp;
        System.out.println("Current balance: " + balance);

    }

    static int selectOperation(Scanner input) {
        System.out.println("Select Operation");
        System.out.println("1 - Check balance");
        System.out.println("2 - Money withdrawal");
        System.out.println("3 - Money deposit");
        return input.nextInt();
    }
}

