import java.util.Scanner;
 public class Coba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bookCategory = "";
        int numberOfBooksBought, discount;
        System.out.print("enter book category (dictonary/novel/other) : ");
        bookCategory = input.nextLine();
        System.out.print("enter number of books bought : ");
        numberOfBooksBought = input.nextInt();
        
        if (bookCategory.equals("dictionary")) {
                discount = 10;
                if (numberOfBooksBought > 2)
                        discount += 2;
                System.out.println("Discount amount is = " + discount + "%");      
        } else if (bookCategory.equals("novel")) {
                discount = 7;
                if (numberOfBooksBought > 3)
                        discount += 2;
                else
                        discount += 1;
                System.out.println("Discount amount is = " + discount + "%"); 
        } else if (bookCategory.equals("other")) {
                if (numberOfBooksBought > 5)
                        discount = 5;
                else
                        discount = 0;
                System.out.println("Discount amount is = " + +discount + "%");
        }
}
}


