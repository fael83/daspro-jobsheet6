import java.util.Scanner;

public class Coba3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter brand (Converse, Sketcher, Nike): ");
        String brand = input.nextLine();

        System.out.print("Enter category (Slip On, High Top, Woman, Man, Kids, Adult): ");
        String category = input.nextLine();

        System.out.print("Enter size range (36-44): ");
        String size = input.nextLine();

        double price = 0;

        if (brand.equals("Converse")) {
            if (category.equals("Slip On")) {
                if (size.equals("36" ) || size.equals("37") || size.equals("38") || size.equals("39") || size.equals("40")) {
                    price = 800000;
                 // } else if (size.equals("40") || size.equals(41) || size.equals(42)|| size.equals(43)|| size.equals(44)) {
                //     price = 1200000;
                 }
            } else if (category.equals("High Top")) {
                if (size.equals("40") || size.equals("41") || size.equals("42") || size.equals("43") || size.equals("44")) {
                    price = 1200000;
                }
            }
        } else if (brand.equals("Sketcher")) {
            if (category.equals("Woman")) {
                if (size.equals("36") || size.equals("37") || size.equals("38") || size.equals("39")|| size.equals("40") || size.equals("41")) {
                    price = 1000000;
                }
            } else if (category.equals("Man")) {
                if (size.equals("41") || size.equals("42") || size.equals("43") || size.equals("44")) {
                    price = 1800000;
                }
            }
        } else if (brand.equals("Nike")) {
            if (category.equals("Kids")) {
                if (size.equals("36") || size.equals("37") || size.equals("38") || size.equals("39") || size.equals("40") || size.equals("41")) {
                    price = 750000;
                }
            } else if (category.equals("Adult")) {
                if (size.equals("40") || size.equals("41") || size.equals("42") || size.equals("43") || size.equals("44")) {
                    price = 1500000;
                }
            }
        }

        if (price > 0) {
            System.out.println("Price: Rp " + price);
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}