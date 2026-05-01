import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double num1, num2, result;

        System.out.println("=================================");
        System.out.println("        SIMPLE CALCULATOR");
        System.out.println("=================================");

        do {

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;

                    System.out.println("Result = " + result);

                    break;

                case 2:

                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;

                    System.out.println("Result = " + result);

                    break;

                case 3:

                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;

                    System.out.println("Result = " + result);

                    break;

                case 4:

                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    if (num2 == 0) {

                        System.out.println("Cannot divide by zero!");

                    } else {

                        result = num1 / num2;

                        System.out.println("Result = " + result);
                    }

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
