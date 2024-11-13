import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //номер 1
        /*Random random = new Random();
        int number = random.nextInt(100) +1;

        Scanner input = new Scanner(System.in);
        int userGuess = -1;
        System.out.println("Try to guess the number that i set up for you!");
        System.out.println("If you want to exit, type 0");

        while(userGuess != number){
            System.out.print("Type the number: ");
            userGuess = input.nextInt();

            if(userGuess == 0){
                System.out.println("You are exit the game");
                break;
            }

            if(userGuess < number){
                System.out.println("The number is greater. Try again");
            }
            else if(userGuess > number){
                System.out.println("The number is less. Try again");
            }

        }
        if(userGuess == number){
            System.out.println("Congratulations, you guessed the number " + number + "!");
        }
        }
    }

//задача 2
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter positive integers to calculate the sum of even numbers.");
        System.out.println("The program will end when you enter 0");

        while (true) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                sum += number;
            }
            System.out.println("The sum of all even numbers entered: " + sum);
        }


        //задача 3
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is prime.");
        System.out.println("The program will end when you enter 0");

        while(true){
            System.out.println("Enter your number: ");
            int number = input.nextInt();

            if(number == 0){
                System.out.println("The program exits");
                break;
            }

            if(number){//Не очень поняла что писать в if, чтобы он выводил простое число
                System.out.println(number + " is a prime number.");
                else{
                    System.out.println(number + " is not a prime number.");
                }
            }
        }

        //задача 4
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        System.out.println("You can perform addition, subtraction, multiplication and division operations.");


        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1 - addition");
            System.out.println("2 - subtraction");
            System.out.println("3 - multiplication");
            System.out.println("4 - division");
            System.out.println("0 - exit");
            System.out.print("Type a number of the operation: ");

            int operation = input.nextInt();

            if (operation == 0) {
                System.out.println("Exit from the calculator.");
                break;
            }

            System.out.print("Type the first number: ");
            double num1 = input.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = input.nextDouble();

            double result = 0;

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error. You can't divide by 0.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Incorrect operation selection.");
            }
        }*/
        //Прочитала про switch в gpt и попробовала заюзать в задании(на уроке хотела бы еще спросить про switch)


        //задача 5
        //Не поняла как сделать задание, смотрела в инете, все равно не особо понятно было




    }

}


