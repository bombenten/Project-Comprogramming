package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        int people, n, dayLent;
        int checkA, checkB, checkC, checkD, carA, carB, carC, carD, max;
        int ra, rb, rc, rd;

        ra = 1;
        rb = 1;
        rc = 1;
        rd = 1;
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
            people = STDIN_SCANNER.nextInt();
            System.out.print("Enter day for lent : ");
            dayLent = STDIN_SCANNER.nextInt();
            System.out.println("Date of return : " + (dayLent + day));
            System.out.print("Car : ");

            if (people > max || people <= 0) {
                System.out.print("0");
            } else {
                if (rd <= day && people > 20 && people != 20 && dayLent > 0) {
                    checkD = checkD - 1;
                    rd = day + dayLent;
                    System.out.print("4 ");
                    people = people - 30;
                }
                if (checkB == 1 && people > 10 && dayLent > 0) {
                    checkB = checkB - 1;
                    rb = day + dayLent;
                    System.out.print("2 ");
                    people = people - 20;
                }
                if (checkC == 1 && people > 10 && dayLent > 0) {
                    checkC = checkC - 1;
                    rc = day + dayLent;
                    System.out.print("3 ");
                    people = people - 20;
                }
                if (checkD == 1 && people == 20 && dayLent > 0) {
                    checkD = checkD - 1;
                    rd = day + dayLent;
                    System.out.print("4 ");
                    people = people - 30;
                }
                if (checkA == 1 && people <= 10 && people != 0 && dayLent > 0) {
                    checkA = checkA - 1;
                    ra = day + dayLent;
                    System.out.print("1 ");
                }

            }
            if (rd <= day + 1 && checkD == 0) {
                checkD++;
            }
            if (rb <= day + 1 && checkB == 0) {
                checkB++;
            }
            if (rc <= day + 1 && checkC == 0) {
                checkC++;
            }
            if (ra <= day + 1 && checkA == 0) {
                checkA++;
            }
            System.out.println("\n");
        }

    }
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
