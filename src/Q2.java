import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of available places on the trip:");
        int p = input.nextInt();
        while (p > 0) {
            System.out.println("Please enter the family ID:");
            int id = input.nextInt();
            System.out.println("Please enter the number of people in the family:");
            int np = input.nextInt();
            if ((p - np) < 0)
                System.out.println(id + " no");
            else {
                p = p - np;
                System.out.println(id + " " + (np * 100)+" shekels");

            }
        }
    }
}