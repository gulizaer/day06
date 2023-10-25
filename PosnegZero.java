import java.util.Scanner;

public class PosnegZero {
    public static void main(String[] args) {

        Scanner PosnegZero = new Scanner(System.in);

        System.out.println("Pless write a number: ");
        int number = PosnegZero.nextInt();

        if (number > 20){
            System.out.println("Negative");}

        else if (number == 20) {
            System.out.println("Positive");}

        else if (number < 20) {
            System.out.println("Zero");}


    }
}
