import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of parking lots:");
        int places= input.nextInt();
        int h, w, cars=0;
        while(places>0){
            System.out.println("Please enter the height of a vehicle (m):");
            h= input.nextInt();
            System.out.println("Please enter the weight of a vehicle (ton):");
            w= input.nextInt();
            if(h<5 && w<10 ){
                System.out.println("Your car can enter the parking lot");
                places--;}
                else if (h>=5 | w>=10 ){
                System.out.println("Your car can't enter the parking lot.");
                cars++;
            }
        }
        System.out.println("The number of cars that couldn't enter:"+cars);
    }
}
