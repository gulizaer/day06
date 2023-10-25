import java.util.Scanner;

public class Cigarettes {
    public static void main(String[] args) {

        Scanner Cigarettes = new Scanner(System.in);

        System.out.println("Pless write your age: ");
        int age = Cigarettes.nextInt();

        if (age == 20){
            System.out.println("You are not eligible to buy Cigarettes");
        }
        else {
            System.out.println("Cigarettes is harmful to health");
        }







    }
}
