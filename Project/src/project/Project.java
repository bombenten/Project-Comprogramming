package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        int pp, n, dl;
        int a, b, c, d, av, bv, cv, dv, max;
        boolean ra, rb, rc, rd;

        ra = true;
        rb = true;
        rc = true;
        rd = true;
        av = 10;
        bv = 20;
        cv = 20;
        dv = 30;
        a = 1;
        b = 1;
        c = 1;
        d = 1;

        for (int day = 1; day < 8; day++) {
            System.out.println("\n\tDay [" + day + "]");
            max = av * a + bv * b + cv * c + dv * d;
            System.out.println("There are " + max + " seats.");
            System.out.print("Enter people for lent : ");
            pp = STDIN_SCANNER.nextInt();
            System.out.print("Enter day for lent : ");
            dl = STDIN_SCANNER.nextInt();
            System.out.println("Date of return : " + (dl + day));
            System.out.print("Car : ");
            
            
            
        }
    }
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
