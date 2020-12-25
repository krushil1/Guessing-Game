import java.util.Scanner; //imports the scanner class

class Main { //main class
  public static void main(String[] args) { //public class
    Scanner keyboard = new Scanner(System.in); //sets scanner to keyboard
    System.out.println("The computer has chosen a number between 1 - 100"); //prompts the user the purpose of this program
   
    int random = (int)(Math.random() * 100 + 1); //generates a number between 1 and 100
   
    

    String repeat = ""; //repeat gets intialized to string
    int guess = -1; //guess gets intialized to integer as -1
    int tries = 0; //tries gets initialized to integer as 0
    do{ //do while loop if the user enters Y to continue
      random = (int)(Math.random() * 100 + 1); //geneterates a random number if the user enter Y to continue
      tries = 0; //sets tries to 0 if the user enters Y to continue
      do{ //do while loop to prompt makes the guesses
        System.out.print("Enter your guess: "); //prompts the user to enter their guess
        guess = keyboard.nextInt(); //stores the user's guess in the guess variable
        if(guess < random){ //if statement runs if guess is less than random
          System.out.println("Too Low!"); //prints Too Low!
          tries++; //increments tries by 1
        }
        else if(guess > random){ //else if statement runs if guess is greater than random 
          System.out.println("Too High!"); //prints Too High!
          tries++; // increments tries by 1
        }
        else if(guess == random){ //else if statement if guess is equal to random
          tries = tries + 1; //tries equals tries plus 1
          System.out.println("Correct! You got it in " + tries + " guesses!"); //prints how many times it took the user to guess the number
        }
      }while(guess != random); //di while loop runs till guess doesn't equal random
      
      System.out.print("Play again? Enter (Y/N): "); //prompts the user to enter Y if they would like to continue and N if they want to end
      repeat = keyboard.next(); //stores the user input in repeat variable
    }while(repeat.equalsIgnoreCase("Y")); //do while loop runs if repeat equals Y
  }
}
