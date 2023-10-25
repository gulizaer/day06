import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner gradeLevel = new Scanner(System.in);

        System.out.println("Pless write your grede level: ");
        int number = gradeLevel.nextInt();

        if (number==1 || number==2 || number==3 || number==4 || number==5) {
            System.out.println("Elementary Scool");}
        else if (number==6 || number==7 || number==8) {
            System.out.println("Middle Scool");}
        else if (number==9 || number==10 || number==11 || number==12) {
            System.out.println("High Scool");}
        else if (number==13 || number==14 || number==15 || number==16) {
            System.out.println("College");}
        else if (number==17 || number==18) {
            System.out.println("Grad Scool");}


    }
}
