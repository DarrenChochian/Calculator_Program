package console;

// Name: DarrenChochian

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstLetter = 0;
        double secondLetter = 0;
        String logicalOperator = "";
        String result = "";

        do {
            while(!result.equals("+") && !result.equals("-") && !result.equals("x") && !result.equals("/")) {
                System.out.println("Choose what logical operator you want to use (+, -, x, /):");
                result = scanner.nextLine().trim();

                if(!result.matches("[+/x-]")) {
                    System.out.println("That is not a valid operator. Please enter an operator.");
                    result = "";
                } else if (result.contains(" ")) {
                    System.out.println("You cannot use spaces. Please enter an operator.");
                    result = "";
                }
            }

            System.out.println("Enter in your first number");
            firstLetter = scanner.nextDouble();
            System.out.println("Enter your second number");
            secondLetter = scanner.nextDouble();

            switch(result) {
                case "+": System.out.println(firstLetter + " + " + secondLetter + " = " + (firstLetter + secondLetter));
                break;
                case "-": System.out.println(firstLetter + " - " + secondLetter + " = " + (firstLetter - secondLetter));
                break;
                case "x": System.out.println(firstLetter + " x " + secondLetter + " = " + (firstLetter * secondLetter));
                break;
                case "/": System.out.println(firstLetter + " / " + secondLetter + " = " + (firstLetter / secondLetter));
                break;
            }
            scanner.nextLine();

            System.out.println("Do you want to complete another calculation? (Y/N)");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("N")) {
                break;
            } else {
                result = "";
            }
        } while(true);
    }
}