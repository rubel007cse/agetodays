import java.util.Scanner;

/**
 * Created by mosharrofrubel on 10/5/16.
 */
public class AgeToDays {

    public static void main(String[] a){


        System.out.println("Enter your age: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        AgeToDays object = new AgeToDays();
        object.myCalculator(i);

    }

     void myCalculator(int age){
        int days = age*365;
        System.out.println("You are living approx "+days+" days!");
    }

}
