import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {

        Scanner MaximumNumber = new Scanner(System.in);

        System.out.println("Type a number between 10 and 20: ");
        int num1 = MaximumNumber.nextInt();

        System.out.println("Pless again Type a number between 10 and 20: ");
        int num2 = MaximumNumber.nextInt();

        if ( num1== 20 ){
            System.out.println(num1 + "is the  maximum nubner");}

        else {
            System.out.println(num2 + "is the not maximum number");}








    }
}
