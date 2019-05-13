/**
 * Name: Nebil Gokdemir
 * Class : Java Progaming
 * Assignment : Project
 *
 * Description: Whenever a user logs on, the user's ID,
 * Lab Number, and the computer station. this program collect this data and insert
 * to into two dimension array.Also user can delete this data with using ID number in the
 * logOff() method
 */

import java.util.Scanner;

 public class ComputerLab {

    // assign lab to two dimention null variable
        static int lab[][] = null;


        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {


  // Creat menuChoose property for menu choose
            int menuChoose = -1;


            lab = new int[4][];
            lab[0] = new int[5];
            lab[1] = new int[6];
            lab[2] = new int[4];
            lab[3] = new int[3];


            while (menuChoose != 0) {

                System.out.println("0 = Quit");
                System.out.println("1 = login");
                System.out.println("2 = logoff");
                System.out.println("3 = Search");
               // assign one integer with scanner method
                menuChoose = input.nextInt();

                if (menuChoose == 1) {

                    logIn();
                    LabStatus();

                } else if (menuChoose == 2) {
                    logOff();
                    LabStatus();

                } else if (menuChoose == 3) {
                    search();


                }

            }


        }
 // this method is for logIn. It gets integer from user  to assign each two dimention array;

        public static void logIn() {


        // i assigned id labNumber and  stationNumber to -10 so that while loop will work with no problem
            int id = -10;
            int labNumber = -10;
            int stationNumber = -10;


            while (id < 0 || id > 99999) {

                System.out.println("Enter the 5 digit ID number of the user logging in:");
                id = input.nextInt();
            }

            while (labNumber < 0 || labNumber > 3) {
                System.out.println("Enter the lab number the user is logging in from (0-3):");
                labNumber = input.nextInt();
            }

            if (labNumber == 0) {
                while (stationNumber < 0 || stationNumber > 4) {

                    System.out.println("Enter computer station number the user is logging in to (0-4):");
                    stationNumber = input.nextInt();
                }


            } else if (labNumber == 1) {

                while (stationNumber < 0 || stationNumber > 5) {

                    System.out.println("Enter computer station number the user is logging in to (0-5):");
                    stationNumber = input.nextInt();
                }


            } else if (labNumber == 2) {

                while (stationNumber < 0 || stationNumber > 3) {

                    System.out.println("Enter computer station number the user is logging in to (0-3):");
                    stationNumber = input.nextInt();
                }

            } else if (labNumber == 3) {

                while (stationNumber < 0 || stationNumber > 2) {

                    System.out.println("Enter computer station number the user is logging in to (0-2):");
                    stationNumber = input.nextInt();
                }


            }


            if (lab[labNumber][stationNumber] != -10) {


                lab[labNumber][stationNumber] = id;


            } else {
                System.out.println("lab" + labNumber + " station" + stationNumber + "is already FULL");
            }


        }
/*
* this method is for logoff. it take one integer from user to math with all array
* if it math any array than i assign this array to -10 which is first variable i assigned
*
*
* */

        public static void logOff() {

            int id = -10;


            System.out.println("Enter the 5 digit ID number of the user to LOG OFF:");
            id = input.nextInt();

            for (int x = 0; x < lab.length; x++) {


                for (int j = 0; j < lab[x].length; j++) {


                    if (lab[x][j] == id) {


                        lab[x][j] = -10;
                        System.out.println("labNumber " + x + " stationNmuber " + j + " is empty now");

                    }


                }
            }


        }


/*
*
* this is methos is for search I get one integer from user and math with all array
* if it math with any array, and then i print lanb and computer stationnumber
*
*
*
*
* */

        public static void search() {


            int id;


            System.out.println("Enter the 5 digit ID number of the user to LOG OFF:");
            id = input.nextInt();

            for (int x = 0; x < lab.length; x++) {


                for (int j = 0; j < lab[x].length; j++) {

                    if (lab[x][j] == id) {

                        System.out.println(" Lab Number " + x + " station number " + j + " the user is logged into ");

                    }


                }
            }


        }

        /*
        *
        * I created this method and i used it in login and logoff in menu to display
        * lab
        *
        * */

        public static void LabStatus() {

            System.out.println("LAB STATUS");

            System.out.println("=========================================================");
            System.out.println("1# C1 = " + lab[0][0] + " || C2 = " + lab[0][1] + " || C3 = " + lab[0][2] + " || C4 = " + lab[0][3] + " || C5 = " + lab[0][4]);
            System.out.println("2# C1 = " + lab[1][0] + " || C2 = " + lab[1][1] + " || C3 = " + lab[1][2] + " || C4 = " + lab[1][3] + " || C5 = " + lab[1][4] +" || C6 = "+ lab[1][5]) ;
            System.out.println("3# C1 = " + lab[2][0] + " || C2 = " + lab[2][1] + " || C3 = " + lab[2][2] + " || C4 = " + lab[2][3] );
            System.out.println("4# C1 = " + lab[3][0] + " || C2 = " + lab[3][1] + " || C3 = " + lab[3][2] );
            System.out.println("===========================================================");

        }

    }






