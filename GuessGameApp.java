import java.util.*;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;


import jdk.javadoc.internal.doclets.formats.html.resources.standard;
import jdk.nashorn.internal.ir.ContinueNode;

public class GuessGameApp{

  public static void main(String[] args) {
    
    int user_input;
    char playing = 'y';
    int num_generated;
    int min = 1;
    int max = 100;
    int range = max - min + 1;
    boolean in_play = true;
    Scanner in = new Scanner(System.in);

    num_generated = (int) (Math.random() * range) + min;

    String welcome_message = ("The GuessGame program plays a guessing game." + "The program will choose a" + "arbitrary number between 1-100" + "and give the you a chance to guess the number." + "You will be" +
    "given an unlimited number of guesses and on each guess," + "you will be told" +
    "whether your guess is too high, too low, or correct." + "You will have the chance" +
    "to repeat the game as many times you wish.");

    System.out.println(welcome_message);

    System.out.println("Let's Begin!");

    while(in_play = true){
      System.out.println("Guess a number between 1-100: ");
      user_input = in.nextInt();

      if(user_input == num_generated){
        System.out.println("Your guess is correct!");
        System.out.print("Would you like to guess another number (y/n)?  ");
        playing = in.next().charAt(0);
        if(playing == 'y' || playing == 'Y'){
          num_generated = (int) (Math.random() * range) + min;
          continue;
        } else if(playing == 'n' || playing == 'N'){
          System.out.println("Thanks for playing the GuessGame!");
          in_play = false;
          continue;
        }
      } else if(user_input < num_generated){
        System.out.println("Your guess is too low. Try again.");
        continue;
      } else if(user_input > num_generated){
        System.out.println("Your guess is too high. Try again.");
        continue;
      }
    }
  }
}

 