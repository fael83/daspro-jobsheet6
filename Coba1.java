public class Coba1 {
    public static void main(String[] args) {
       int num1 = 28, num2 = 54, num3 = 15, maxValue;
       maxValue = num1;
       if (num2 > maxValue){
            maxValue = num2;
       } if (num3 > maxValue) {
            maxValue = num3;
       }
       System.out.println("Max Number = " + maxValue);
    }
}