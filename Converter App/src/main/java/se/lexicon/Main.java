package se.lexicon;

import java.util.Objects;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        boolean KeepRunning = true;


        while (KeepRunning) {
            System.out.println("=========================");
            System.out.println("LEXICON CONVERTER APP");
            System.out.println("=========================");
            System.out.println("1. Temperature Converter");
            System.out.println("2. Currency Converter");
            System.out.println("3. BMI Calculator");
            System.out.println("4. Exit");
            System.out.println("==========================");
            System.out.println("Choose an option: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println("--- Temperature Converter ---");
                System.out.println("Convert: ");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                int choice2 = scanner.nextInt();
                System.out.println("Your choice: " + choice2);

                if (choice2 == 1) {
                    System.out.println("Enter temperature in Celsius: ");
                    Scanner Temper2 = new Scanner(System.in);
                    double C = Temper2.nextDouble();
                    double Fahrenheit = C * 9.0 / 5.0 + 32;
                    System.out.println("Result: " + C + " C " + Fahrenheit + " F");
                    System.out.println("Continue? (yes/no)");
                    String answer = scanner.next();

                    if (answer.equalsIgnoreCase("no")) {
                        KeepRunning = false;

                        System.out.println();
                        System.out.println("Goodbye!");
                    }

                } else if (choice2 == 2) {

                    System.out.println("Enter temperature in Fahrenheit: ");
                    Scanner Temper3 = new Scanner(System.in);
                    double F = Temper3.nextDouble();
                    double Celsius = (F - 32) * 5.0 / 9.0;
                    System.out.println("Result: " + F + " F " + Celsius + " C");
                    System.out.println("Continue? (yes/no)");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("no")) {
                        KeepRunning = false;
                        System.out.println();
                        System.out.println("Goodbye!");

                    }

                }
            } else if (choice == 2) {
                System.out.println("--- Currency Converter ---");
                System.out.println("Convert: ");
                System.out.println("1.  SEK to USD ");
                System.out.println("2.  SEK to EUR ");
                int choice3 = scanner.nextInt();
                System.out.println("Your choice: " + choice3);

                if (choice3 == 1) {
                    System.out.println("Enter amount in SEK:  ");
                    double SEk = scanner.nextDouble();
                    double USD = SEk / 10.87;
                    System.out.println("Result:  " + SEk + " SEK " + " = " + USD + " USD ");
                    System.out.println("Continue? (yes/no)");
                    String answer2 = scanner.next();
                    if (answer2.equalsIgnoreCase("no")) {
                        KeepRunning = false;
                        System.out.println();

                        System.out.println("Goodbye!");


                    }
                } else if (choice3 == 2) {
                    System.out.println("Enter amount in SEK:  ");
                    double SEk = scanner.nextDouble();
                    double EUR = SEk / 11.32;
                    System.out.println("Result:  " + SEk + " SEK " + " = " + EUR + " EUR ");
                    System.out.println("Continue? (yes/no)");
                    String answer4 = scanner.next();
                    if (answer4.equalsIgnoreCase("no")) {
                        KeepRunning = false;
                        System.out.println();
                        System.out.println("Goodbye!");

                    }
                }
            } else if (choice == 3) {
                System.out.println("--- BMI Calculator --- ");
                System.out.println("Enter weight in kg: ");
                double w = scanner.nextDouble();
                System.out.println("Enter height in Meters: ");
                double h = scanner.nextDouble();
                Double bmi = w / Math.pow(h, 2);
                if (bmi < 18.5) {
                    System.out.println("BMI: " + bmi + " Underweight");
                } else if (bmi > 18.5 && bmi < 24.9) {
                    System.out.println("BMI: " + bmi + " normal");
                } else if (bmi > 25 && bmi < 29.9) {
                    System.out.println("BMI: " + bmi + " Overweight");
                } else {
                    System.out.println("BMI: " + bmi + " Obese");
                }
                    System.out.println("Continue? (yes/no)");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("no")) {
                        KeepRunning = false;
                    }
                    System.out.println();
                    System.out.println("Goodbye!");
                }
                if (choice == 4) {
                    KeepRunning = false;
                    System.out.println("==========================");
                    System.out.println("LEXICON CONVERTER APP");
                    System.out.println("==========================");
                    System.out.println("1. Temperature Converter");
                    System.out.println("2. Currency Converter");
                    System.out.println("3. BMI Calculator");
                    System.out.println("4. Exit");
                    System.out.println("=========================");
                    System.out.println("Choose an option: " + choice);
                    System.out.println("Goodbye!");
                }

            }

        }
    }








