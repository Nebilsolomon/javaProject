import java.util.Random;
import java.util.Scanner;


//Nebil Gokdemir
//JavaProjects2
//Paper Scissors against the computer

public class RockPaperScissorsGame {



    public static void main(String[] args) {


/* I call determineWinner method in do while
    determineWinner take 2 char parameter. For first char i used
    userChoice() method which return one char from user and for second
    parameter i used computerChoice() method which return ramdom char
    from computer. And playAgain() return boolean

  */
        do {

            determineWinner(userChoice(), computerChoice());

        }while(playAgain());

    }

// This method is for getting one char from user and return it

    public static char userChoice() {
        Scanner input = new Scanner(System.in);
        // i declare empty char
        char charValue = '0';
        // Declare one string
        String userChoice ;
        System.out.println("==========");
        System.out.println("PLEASE CHOOSE ONE OF THIS");
        System.out.println(" rock\n paper\n scissors");
        // Getting one string from user and assign to userChoice string
        userChoice = input.next();
        // make lowercase useuserChoicer
        userChoice = userChoice.toLowerCase();

        /*this if else statment is for checking  value of userChoice
      if it is rock and than change empty charValue to r
      if it paper change empty charValue to p
      if it is SCISSOR change empty charValue to s
      and than return this charValue

       */
        if( userChoice.equals("rock")){
            charValue = 'r';
        }
        else if (userChoice.equals("paper")){
            charValue = 'p';
        }
        else if (userChoice.equals("scissors")){
            charValue = 's';
        }
        else {

            System.out.println("Please type correctly your choice ");
            System.out.println("");
            determineWinner(userChoice(), computerChoice());
        }


        return  charValue;
    }
    /*
    this method is for return random char
    computer generate from 1 to 3
    if random number is 1 i change choice char to r
    if random number is 2 i change choice char to p
    if random number is 3 i change choice char to s
    and than i return this choice char

     */
    public static char computerChoice() {
        char choice = 0;
        Random inputRandomNum = new Random();

        int num = inputRandomNum.nextInt(3) + 1;
        if(num == 1) {
            choice = 'r';
        }
        else if(num == 2) {
            choice = 'p';
        }
        else if (num ==3) {
            choice = 's';
        }

        return choice;


    }
    /*
    This method take 2 char parameter and than i will called in main method and use computerChoice() and
    userChoice() method as parameter and i compare than in if else statement because both method return one char


     */

    public static void determineWinner(char forUser,char forComputer){

        if(forUser =='r' && forComputer =='r') {


            System.out.println("there is no winner");
        }
        else if(forUser =='r' && forComputer == 'p') {

            System.out.println("Paper wraps rock");
            System.out.println("computer won");
        }
        else if(forUser =='r' && forComputer =='s') {

            System.out.println("The rock smashes the scissors");
            System.out.println("you won");
        }
        else if(forUser=='p' && forComputer =='r') {

            System.out.println("Paper wraps rock");
            System.out.println("you won");
        }
        else if(forUser =='p' && forComputer =='p') {

            System.out.println("there is no winner");
        }
        else if(forUser=='p' && forComputer =='s') {

            System.out.println("Scissors cuts paper");
            System.out.println("computer won");
        }
        else if(forUser =='s' && forComputer =='r') {


            System.out.println("The rock smashes the scissors");
            System.out.println("computer won");
        }
        else if(forUser =='s' && forComputer =='p') {

            System.out.println("Scissors cuts paper");
            System.out.println("you won");
        }
        else if(forUser =='s' && forComputer =='s') {

            System.out.println("there is no winner");
        }





    }


    /*

    This method return true or false  boolean base on user string input
    i create one string and one boolean i asked user with scanner one string and assign to
    play string if y or Y i change  falseOrTrue char to true if it was something else
    i assign to false
    and then i return this falseOrTrue boolean  and later use in do while if player want to play again or not

     */

    public static boolean playAgain() {
        Scanner input = new Scanner(System.in);

        boolean falseOrTrue = true;
        String play = "" ;
        System.out.println("Do you want to play again [y/n]");
        play = input.nextLine();
        if(play.equals("y") || play.equals("Y")){
            falseOrTrue = true;
        }
        else {
            falseOrTrue = false;
            System.out.println("bye bye");
        }





        return  falseOrTrue;

    }



}



