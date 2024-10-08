import java.util.Scanner;
public class Selection2Exp1244107060039 {

    public static void main(String[] args) {
        Scanner input244107060039 = new Scanner(System.in);
        System.out.print("Input year = ");
        int year = input244107060039.nextInt();
        if (year %4 == 0) 
            if (year %100 == 0 )
                if  (year %400 == 0)
                    System.out.println("Leap year");
                else 
                    System.out.println("Not a leap year");
            else 
                System.out.println("Leap year");
        else 
            System.out.println("Not a leap year");
        }
    }
