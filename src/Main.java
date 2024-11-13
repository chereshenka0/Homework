import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //номер 1
        Random random = new Random();
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
