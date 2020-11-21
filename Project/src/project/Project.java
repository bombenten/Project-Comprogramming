package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        int pp, n, dl;
        int a, b, c, d, av, bv, cv, dv, max;
        int ra, rb, rc, rd;

        ra = 1;
        rb = 1;
        rc = 1;
        rd = 1;
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
            
        if(pp>max||pp<=0){
		System.out.print("0");
	}
	else{
            if(rd<=day && pp>20 && pp!=20&&dl>0){
                d=d-1;
                rd = day + dl;
                System.out.print("4 ");
                pp = pp - 30 ;
            }
                    if(b==1&&pp>10&&dl>0){
                            b=b-1;
                            rb = day + dl;
                            System.out.print("2 ");
                            pp = pp - 20 ;	
                    }
                    if(c==1&&pp>10&&dl>0){
                            c=c-1;
                            rc = day + dl;	
                            System.out.print("3 ");
                            pp = pp - 20 ;		
                    }
                    if(d==1&&pp==20&&dl>0){
                            d=d-1;
                            rd = day + dl;
                            System.out.print("4 ");
                            pp = pp - 30 ;
                    }
                    if(a==1&&pp<=10&&pp!=0&&dl>0){
                            a=a-1;
                            ra = day + dl;
                            System.out.print("1 ");	
                    }

            }
            if(rd<=day+1&&d==0){
                    d++;
            }
            if(rb<=day+1&&b==0){
                    b++;
            }
            if(rc<=day+1&&c==0){
                    c++;	
            }
            if(ra<=day+1&&a==0){
                    a++;
            }
            System.out.println("\n");	
    }

    }
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
