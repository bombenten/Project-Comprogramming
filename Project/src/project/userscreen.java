
package project;
import project.rental;
import java.util.Scanner;
/**
 *
 * @author Mook
 */
public class userscreen {
    rental p1 = new rental(10, 2);
    Scanner myValue = new Scanner(System.in);
    for (int day = 1;day< 8; day++) {
            System.out.println("\n\tDay [" + day + "]");
        max = carA * checkA + carB * checkB + carB * checkC + carD * checkD;
        System.out.println("There are " + max + " seats.");
        System.out.print("Enter people for lent : ");
        people = myValue.nextInt();
        System.out.print("Enter day for lent : ");
        dayLent = myValue.nextInt();
        System.out.println("Date of return : " + (dayLent + day));
        System.out.print("Car : ");
        p1.checkAndSelectCar();
        System.out.println("\n");
    }
    
}
