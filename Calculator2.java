import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator2 {


    public static void main(String[]args) {
        // Decimal class for make double number decimal
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner input =  new Scanner(System.in);
       // Declare two number to do calculation
        double num1 = 0, num2 = 0;
        // This choice string is for make choice for operation
        String choice = "";
        //playover is for while loop
        String playover = "y";


        while(playover.equals("y") || playover.equals("Y")) {
        System.out.println("Hi, I am really good at math! Put me to the test");
        System.out.println("Please enter two numbers and then press Enter: ");
        // i used try catch in case if user input char or String to catch error
        try {
            num1 = input.nextDouble();
            num2 = input.nextDouble();
            System.out.println("Please enter one of the operations +, -, * or / ");
        } catch (Exception e) {
            System.out.println("Because you didn't enter integer number "+e+" error occur");
        }


        choice = input.next();

        // if user enter + scope of this if statement will work
        if(choice.equals("+")){

             double sumOfNum = num1 + num2;
             System.out.println("sum of number is = " + decimalFormat.format(sumOfNum));
            System.out.println("I'm great at addition! ");


        }
        // if user enter - scope of this if statement will work
        else if(choice.equals("-")){
            double subtractOfNum = num1 - num2;
            System.out.println("sum of number is = " + decimalFormat.format(subtractOfNum));
            System.out.println("I'm great at subtraction! ");

        }
        // if user enter * scope of this if statement will work
        else if(choice.equals("*")) {
            double multiplicationOfNum = num1 * num2;
            System.out.println("sum of number is = " + decimalFormat.format(multiplicationOfNum));
            System.out.println("I'm great at multiplication! ");

        }
        // if user enter / scope of this if statement will work
        else if(choice.equals("/")){
            double divOfNum = num1 / num2;
            System.out.println("sum of number is = " + decimalFormat.format(divOfNum));
            System.out.println("I'm great at division! ");

        }
        // if choice for operation is not equel + , / , * and - this else statement will print
        else {

            System.out.println("I can compute really well, but what you entered is not one of the operations I know ...");

        }
         // This scope of code is for while loop  becuase while loop argument is y and Y
         // is user input Y or y while loop will generate unless than that will go out of while
            System.out.println("Play again [Y/N]");
        //This line user enter for playover
            playover = input.next();
            // if playover is not y or Y it will genere prin Bye bye
           if(!playover.equals("y") && !playover.equals("Y")) {
               System.out.println("Bye bye!");
           }



        }












    }




}
