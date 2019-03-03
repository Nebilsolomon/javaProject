import javax.swing.*;
import java.text.DecimalFormat;

public class Calculator {

   static DecimalFormat input = new DecimalFormat("0.00");
   static String num1, num2;
   static String choose;
   static String playover = "Y";
    public static void main(String[] args) {


//        JOptionPane.showMessageDialog(null, "Please enter 2 number");
//        num1 = JOptionPane.showInputDialog("Enter firt number");
//        num2 = JOptionPane.showInputDialog("Enter second number");
//        // JOptionPane.showMessageDialog(null,"For Addition type + \n "+"For  subtraction - \n For divison type/ \n "+"For multiplicatiom type * \n ");
//        choose = JOptionPane.showInputDialog("For Addition type + \n " + "For  subtraction - \n For divison type/ \n " + "For multiplicatiom type * \n ");
        while (playover.equals("Y") || playover.equals("y")) {
            JOptionPane.showMessageDialog(null, "Please enter 2 number");
            num1 = JOptionPane.showInputDialog("Enter firt number");
            num2 = JOptionPane.showInputDialog("Enter second number");
            // JOptionPane.showMessageDialog(null,"For Addition type + \n "+"For  subtraction - \n For divison type/ \n "+"For multiplicatiom type * \n ");
            choose = JOptionPane.showInputDialog("For Addition type + \n " + "For  subtraction - \n For divison type/ \n " + "For multiplicatiom type* \n ");
            System.out.println(playover +" up");

            if (choose.equals("+")) {
                try {
                    double Addition =   Double.parseDouble(num1) + Double.parseDouble(num2);
                    double x = Double.parseDouble(input.format(Addition));
                    String convertToString = Double.toString(x);
                    JOptionPane.showMessageDialog(null, "addition of number is " + convertToString);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"please just type integer" + e + " error occur");
                }

            } else if (choose.equals("-")) {
                try {
                    double subtraction =  Double.parseDouble(num1) - Double.parseDouble(num2);
                    double x = Double.parseDouble(input.format(subtraction));
                    String convertToString = Double.toString(x);
                    JOptionPane.showMessageDialog(null, "subtraction of number is " + convertToString);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"please just type integer" + e + " error occur");
                }
            } else if (choose.equals("*")) {
                try {

                    double multiplicatiom =  Double.parseDouble(num1) * Double.parseDouble(num2);
                    double x = Double.parseDouble(input.format(multiplicatiom));
                    String convertToString = Double.toString(x);
                    JOptionPane.showMessageDialog(null, "multiplicatiom of number is " + convertToString);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"please just type integer" + e + " error occur");
                }
            } else if (choose.equals("/")) {
                try {




                    double divison =  Double.parseDouble(num1) / Double.parseDouble(num2);
                    double x = Double.parseDouble(input.format(divison));
                    String convertToString = Double.toString(x);



//                    int divison = Integer.parseInt(num1) / Integer.parseInt(num2);
//                    String convertToString = Integer.toString(divison);
                    JOptionPane.showMessageDialog(null, "divison of number is " + convertToString);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"please just type integer" + e + " error occur");
                }
            } else {

                JOptionPane.showMessageDialog(null,"I can compute really well, but what you entered is not one of the operations I");
               // I can compute really well, but what you entered is not one of the operations I
                nebil();
//                JOptionPane.showMessageDialog(null, "For Addition type + \n " + "For  subtraction - \n For divison type/ \n " + "For multiplicatiom type * \n ");
//                JOptionPane.showMessageDialog(null, "Please enter 2 number");
//                num1 = JOptionPane.showInputDialog("Enter firt number");
//                num2 = JOptionPane.showInputDialog("Enter second number");
//                // JOptionPane.showMessageDialog(null,"For Addition type + \n "+"For  subtraction - \n For divison type/ \n "+"For multiplicatiom type * \n ");
//                choose = JOptionPane.showInputDialog("For Addition type + \n " + "For  subtraction - \n For divison type/ \n " + "For multiplicatiom type* \n ");
//
//                if (choose.equals("+")) {
//                    int Addition = Integer.parseInt(num1) + Integer.parseInt(num2);
//                    String convertToString = Integer.toString(Addition);
//                    JOptionPane.showMessageDialog(null, "addition of number is " + convertToString);
//
//
//                } else if (choose.equals("-")) {
//                    int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
//                    String convertToString = Integer.toString(subtraction);
//                    JOptionPane.showMessageDialog(null, "subtraction of number is " + convertToString);
//                } else if (choose.equals("*")) {
//                    int multiplicatiom = Integer.parseInt(num1) * Integer.parseInt(num2);
//                    String convertToString = Integer.toString(multiplicatiom);
//                    JOptionPane.showMessageDialog(null, "multiplicatiom of number is " + convertToString);
//                } else if (choose.equals("/")) {
//                    int divison = Integer.parseInt(num1) / Integer.parseInt(num2);
//                    String convertToString = Integer.toString(divison);
//                    JOptionPane.showMessageDialog(null, "divison of number is " + convertToString);}



            }
            playover = JOptionPane.showInputDialog(null,"Do you want to play [y/n]");
            System.out.println(playover +" down");
        }
        JOptionPane.showMessageDialog(null,"Bye Bye");

    }







    public static void nebil () {

   // JOptionPane.showMessageDialog(null, "For Addition type + \n " + "For  subtraction - \n For divison type/ \n " + "For multiplicatiom type * \n ");
    JOptionPane.showMessageDialog(null, "Please enter 2 number");
    num1 = JOptionPane.showInputDialog("Enter firt number");
    num2 = JOptionPane.showInputDialog("Enter second number");
    // JOptionPane.showMessageDialog(null,"For Addition type + \n "+"For  subtraction - \n For divison type/ \n "+"For multiplicatiom type * \n ");
    choose = JOptionPane.showInputDialog("For Addition type + \n " + "For  subtraction - \n For divison type/ \n " + "For multiplicatiom type* \n ");

    if (choose.equals("+")) {
        int Addition = Integer.parseInt(num1) + Integer.parseInt(num2);
        String convertToString = Integer.toString(Addition);
        JOptionPane.showMessageDialog(null, "addition of number is " + convertToString);


    } else if (choose.equals("-")) {
        int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
        String convertToString = Integer.toString(subtraction);
        JOptionPane.showMessageDialog(null, "subtraction of number is " + convertToString);
    } else if (choose.equals("*")) {
        int multiplicatiom = Integer.parseInt(num1) * Integer.parseInt(num2);
        String convertToString = Integer.toString(multiplicatiom);
        JOptionPane.showMessageDialog(null, "multiplicatiom of number is " + convertToString);
    } else if (choose.equals("/")) {
        int divison = Integer.parseInt(num1) / Integer.parseInt(num2);
        String convertToString = Integer.toString(divison);
        JOptionPane.showMessageDialog(null, "divison of number is " + convertToString);}


}



}
