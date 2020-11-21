package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        int people, n, dayLent, max;
        int checkA, checkB, checkC; //check status car if 0 = not have car
        int checkD, carA, carB, carC, carD; 
        int returnA, returnB, returnC, returnD; //

        returnA = 1;
        returnB = 1;
        returnC = 1;
        returnD = 1;
        carA = 10;
        carB = 20;
        carC = 20;
        carD = 30;
        checkA = 1;
        checkB = 1;
        checkC = 1;
        checkD = 1;

        for (int day = 1; day < 8; day++) {
            System.out.println("\n\tDay [" + day + "]");
            max = carA * checkA + carB * checkB + carB * checkC + carD * checkD;
            System.out.println("There are " + max + " seats.");
            System.out.print("Enter people for lent : ");
            people = myValue.nextInt();
            System.out.print("Enter day for lent : ");
            dayLent = myValue.nextInt();
            System.out.println("Date of return : " + (dayLent + day));
            System.out.print("Car : ");

            if (people > max || people <= 0) {
                System.out.print("0");
            } else {
                if (returnD <= day && people > 20 && people != 20 && dayLent > 0) {
                    checkD = checkD - 1;
                    returnD = day + dayLent;
                    System.out.print("4 ");
                    people = people - 30;
                }
                if (checkB == 1 && people > 10 && dayLent > 0) {
                    checkB = checkB - 1;
                    returnB = day + dayLent;
                    System.out.print("2 ");
                    people = people - 20;
                }
                if (checkC == 1 && people > 10 && dayLent > 0) {
                    checkC = checkC - 1;
                    returnC = day + dayLent;
                    System.out.print("3 ");
                    people = people - 20;
                }
                if (checkD == 1 && people == 20 && dayLent > 0) {
                    checkD = checkD - 1;
                    returnD = day + dayLent;
                    System.out.print("4 ");
                    people = people - 30;
                }
                if (checkA == 1 && people <= 10 && people != 0 && dayLent > 0) {
                    checkA = checkA - 1;
                    returnA = day + dayLent;
                    System.out.print("1 ");
                }

            }
            if (returnD <= day + 1 && checkD == 0) {
                checkD++;
            }
            if (returnB <= day + 1 && checkB == 0) {
                checkB++;
            }
            if (returnC <= day + 1 && checkC == 0) {
                checkC++;
            }
            if (returnA <= day + 1 && checkA == 0) {
                checkA++;
            }
            System.out.println("\n");
        }

    }
    public final static Scanner myValue = new Scanner(System.in);
}
