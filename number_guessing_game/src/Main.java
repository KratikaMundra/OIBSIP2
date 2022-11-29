import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        game();
    }
    public static void game(){
        //scanner class
        Scanner s=new Scanner(System.in);

        //generate number
        Random r = new Random();
        int no = r.nextInt(100);

        //number of attempts
        int trials=5;
        int i,guess;
        System.out.println("\nYou have to guess the number chosen by computer between 1 and 100");
        System.out.println("You have to guess the number correctly in 5 attempts \n");

        //iterate till the last attempt
        for(i=1;i<=trials;i++){

            //taking input from user
            System.out.println("Guess the number: ");
            guess=s.nextInt();

            //compare the original number and user's guessed number
            if(guess==no){
                if(i==1) {
                    System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳 \n");
                    System.out.println("you have earned 100 points");
                }
                else if(i==2) {
                    System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳 \n");
                    System.out.println("you have earned 70 points");
                }
                else if(i==3) {
                    System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                    System.out.println("you have earned 50 points");
                }
                else if(i==4) {
                    System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                    System.out.println("you have earned 30 points");
                }
                else if(i==5) {
                    System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                    System.out.println("you have earned 10 points");
                }
                break;
            } else if (guess>no && i!=trials) {
                System.out.println("The number is less than "+guess);
            }
            else if(guess<no && i!=trials){
                System.out.println("The number is greater than "+guess);
            }
            if(i==trials){
                System.out.println("Oh No!!! You did not guessed it right and your no. of attempts are over"+"😢☹️\n");
                System.out.println("you have earned 0 points\n");
                System.out.println("The number was "+no+"\n");
            }
        }

        System.out.println("you can play one more round");
        System.out.println("Enter 'YES' if want to play or 'NO' if do not want to play");
        String play=s.next();
        if(play.equalsIgnoreCase("yes")){
            Random ra = new Random();
            int num = ra.nextInt(100);
            int attempts=5;
            int j,guessing;
            System.out.println("\n You have to guess the number chosen by computer between 1 and 100");
            System.out.println("You have to guess the number correctly in 5 attempts\n");
            for(j=1;j<=attempts;j++){
                System.out.println("Guess the number: ");
                guessing=s.nextInt();
                if(guessing==num){
                    if(j==1) {
                        System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                        System.out.println("you have earned 100 points");
                    }
                    else if(j==2) {
                        System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                        System.out.println("you have earned 70 points");
                    }
                    else if(j==3) {
                        System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                        System.out.println("you have earned 50 points");
                    }
                    else if(j==4) {
                        System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                        System.out.println("you have earned 30 points");
                    }
                    else if(j==5) {
                        System.out.println("Congratulations!!!" + "You guessed it right" + "🤩🥳\n");
                        System.out.println("you have earned 10 points");
                    }
                    break;
                } else if (guessing>num && j!=attempts) {
                    System.out.println("The number is less than "+guessing);
                }
                else if(guessing<num && j!=attempts){
                    System.out.println("The number is greater than "+guessing);
                }
                if(j==attempts){
                    System.out.println("Oh No!!! You did not guessed it right and your no. of attempts are over"+"😢☹️ \n");
                    System.out.println("you have earned 0 points \n");
                    System.out.println("The number was "+num+"\n");
                }
            }
            System.out.println("Thank You For Playing ");
        }
        else{
            System.out.println("Thank You For Playing ");
        }
    }
}