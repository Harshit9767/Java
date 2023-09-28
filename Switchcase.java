import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter valid Number ");
        int number = sc.nextInt();


        //Switch expression
        switch (number) {
            //Case statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            //Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        // loops
        for (int i = 0; i < 10; i++) {
            System.out.println("hey ");


        }
    }
}







