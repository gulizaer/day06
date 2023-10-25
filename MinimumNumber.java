import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner MinimumNumber = new Scanner(System.in);

        System.out.println("Pless write the minimum number betwen 10 and 20:");
        int num1 = MinimumNumber.nextInt();

        System.out.println("Pless write again the minimum number betwen 10 and 20:");
        int num2 = MinimumNumber.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is not the minimum number");}
        if (num1 == num2) {
            System.out.println(num1+ " and" + num2 + "is the Equal number");}

        if (num1<num2) {
            System.out.println(num1 + " is the minimum number");
        }



    }
}
