package testing.lexicon;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float nbr1, nbr2;// Delphi Style;
        float aSum, aMulti, aDiv, aSub;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
         nbr1= sc.nextFloat();

        System.out.println("Enter second number");
         nbr2= sc.nextFloat();

        // The Calc
        aSum=nbr1+nbr2;
        aMulti=nbr1*nbr2;
        aDiv=nbr1/nbr2;
        aSub=nbr1-nbr2;

        // The Result:

        System.out.println("Sum: "+aSum);
        System.out.println("Multiplication: "+aMulti);
        System.out.println("Division : "+aDiv);
        System.out.println("Subtraction  : "+aSub);
    }
}
