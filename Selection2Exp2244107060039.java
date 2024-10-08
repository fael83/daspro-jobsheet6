import java.util.Scanner;
public class Selection2Exp2244107060039 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Input angle 1 = ");
        int angle1 = input13.nextInt();
        System.out.print("Input angle 2 = ");
        int angle2 = input13.nextInt();
        System.out.print("Input angle 3 = ");
        int angle3 = input13.nextInt();
        int totalAngle = angle1 + angle2 + angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) 
                System.out.println("Right triangle"); 
            else if (angle1 == angle2 && angle2 == angle3) 
                System.out.println("Equilateral triangle");
            else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) 
                System.out.println("Isosceles triangle");
        else
            System.out.println("Not a triangle");

        }
        }
    }