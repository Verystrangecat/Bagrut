import java.util.Scanner;

public class tet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p0, p1, p2;
        int rep0 = 0, rep1 = 0, rep2 = 0;
        System.out.println("Please enter the prices for packages (regular, expanded, big):");
        p0= input.nextInt();
        p1= input.nextInt();
        p2= input.nextInt();
        while ( rep0<500 && rep1<500 && rep2<500 ) {
            System.out.println("Please enter your id:");
            int id = input.nextInt();
            System.out.println("Please enter the number of package that you want (0-regular, 1-expanded, 2-big):");
            int pack = input.nextInt();
            if (pack == 0) {
                System.out.println(id + " " + p0 + " shekels");
                rep0++;
            } else if (pack == 1) {
                System.out.println(id + " " + p1 + " shekels");
                rep1++;
            } else if (pack == 2) {
                System.out.println(id + " " + p2 + " shekels");
                rep2++;
            } else
                System.out.println("That's not an option");}
        System.out.println("End");

    }
}





