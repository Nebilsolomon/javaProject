import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class NebilGokdemir {


    public static void main(String[] args) {

    do {
        determineWinner(userChoice(), computerChoice());
    }while(playAgain());



//     while(playAgain()) {
//
//         determineWinner(userChoice(), computerChoice());
//     }
    }


    public static char userChoice() {
        Scanner input = new Scanner(System.in);
        char charValue = '0';
        String userChoice ;
        System.out.println("PLEASE CHOOSE ONE OF THIS");
      System.out.println("rock\npaper\nscissor");
        userChoice = input.next();
        userChoice = userChoice.toLowerCase();
        if( userChoice.equals("rock")){
            charValue = 'r';
        }
        else if (userChoice.equals("paper")){
            charValue = 'p';
        }
        else if (userChoice.equals("SCISSOR")){
            charValue = 's';
        }
        else {
            System.out.println("please enter rock paper or scissor not " + userChoice);
        }


//        Scanner input = new Scanner(System.in);
//        String choice = "";
//        System.out.println("PLEASE CHOOSE ONE OF THIS");
//        System.out.println("rock\npaper\nscissor");
//        choice = input.nextLine();
//
//        if
////        choice = choice.toLowerCase();

  // return choice.charAt(0) ;
       return  charValue;
    }


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

    public static void determineWinner(char forUser,char forComputer){

       if(forUser =='r' && forComputer =='r') {

           System.out.println("user r computer r");
       }
       else if(forUser =='r' && forComputer == 'p') {
           System.out.println("user r and computer p");
       }
       else if(forUser =='r' && forComputer =='s') {
           System.out.println("user r and computer  s");
       }
       else if(forUser=='p' && forComputer =='r') {
           System.out.println("user p and computer r");
       }
       else if(forUser =='p' && forComputer =='p') {
           System.out.println("user p and computer p");
       }
       else if(forUser=='p' && forComputer =='s') {
           System.out.println("user p and computer s");
       }
       else if(forUser =='s' && forComputer =='r') {
           System.out.println("user s and computer r");
       }
       else if(forUser =='s' && forComputer =='p') {
           System.out.println("user s and computer p");
       }
       else if(forUser =='s' && forComputer =='s') {
           System.out.println("user s and computer s");
       }





    }


public static boolean playAgain() {
    boolean falseOrTrue = true;
    String play = "" ;
    System.out.println("Do you want to play again [y/n]");
    Scanner input = new Scanner(System.in);
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