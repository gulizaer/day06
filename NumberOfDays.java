import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner NumberOfDays = new Scanner(System.in);

        System.out.println("Pless write the month number");
        int number = NumberOfDays.nextInt();

        if (number==1 || number==3 || number==5 || number==7 || number==8 || number==10 || number==12){
            System.out.println("31 days");}

        else if (number==4 || number==6 || number==9 || number==11){
            System.out.println("30 days");}

        else if (number==2){
            System.out.println("28 days");}




    }
}
