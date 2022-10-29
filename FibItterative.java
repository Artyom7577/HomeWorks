import java.util.Scanner;
public class FibItterative {
    public static void main(String[] args) {

        int maxNumber = 0;
        int previousNumber = 0;
        int nextNumber = 1;

        Scanner Scanner = new Scanner(System.in);
        maxNumber = Scanner.nextInt();

        for(int i = 1; i <= maxNumber; ++i){

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        System.out.println("Fib Number " + maxNumber + " is ---> " + (nextNumber - previousNumber) + ".");
    }
}
