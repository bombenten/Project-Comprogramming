package project;

public class rental {

    private int returnA = 1;
    private int returnB = 1;
    private int returnC = 1;
    private int returnD = 1;
    private final int carA = 10;     //totle seet of car
    private final int carB = 20;
    private final int carC = 20;
    private final int carD = 30;
    private int checkA = 1;    //when 1 is avalible and 0 is not avalible
    private int checkB = 1;
    private int checkC = 1;
    private int checkD = 1;
    private int n, dayLent;
    private int people;
    private int day = 0;
    private int max = carA * checkA + carB * checkB + carB * checkC + carD * checkD;
    
    public rental(int people,int day) {
        this.people = people;
        this.day = day;
    }

    public String checkAndSelectCar() {
        if (people > max || people <= 0) {
        } else {
            if (returnD <= day && people > 20 && people != 20 && dayLent > 0) {
                checkD = checkD - 1;
                returnD = day + dayLent;
                people = people - 30;
                return "4";
            }
            if (checkB == 1 && people > 10 && dayLent > 0) {
                checkB = checkB - 1;
                returnB = day + dayLent;
                people = people - 20;
                return "2";
            }
            if (checkC == 1 && people > 10 && dayLent > 0) {
                checkC = checkC - 1;
                returnC = day + dayLent;
                people = people - 20;
                return "3";
            }
            if (checkD == 1 && people == 20 && dayLent > 0) {
                checkD = checkD - 1;
                returnD = day + dayLent;
                people = people - 30;
                return "4";
            }
            if (checkA == 1 && people <= 10 && people != 0 && dayLent > 0) {
                checkA = checkA - 1;
                returnA = day + dayLent;
                return "1";
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
        return "0";
    }

    public int getPeople(int people) {
        return people;
    }
    
}
