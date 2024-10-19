package Test1;
import java.util.Arrays;
import java.util.Scanner;


public class ComputeGreatest {
    //Write a Java program that accepts three numbers from the user,
    // uses a function called Nums to compute and display their sum and the second greatest number
    public static void main(String[] args) {
        int[] numArrays = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input three numbers(eg: 4 3 2) : ");
        numArrays[0] = scanner.nextInt();
        numArrays[1] = scanner.nextInt();
        numArrays[2] = scanner.nextInt();

        nums(numArrays[0],numArrays[1],numArrays[2]);
        secondGreatestNum(numArrays);
    }

    private static void secondGreatestNum(int[] numArrays) {
        Arrays.sort(numArrays);
        //System.out.println(Arrays.toString(numArrays));
        System.out.println("The Second greatest number : " + numArrays[1]);
    }

    static void nums(int num1, int num2, int num3){
        int nums = num1 + num2 + num3;
        int greatest = num1;
        greatest = Math.max(greatest, num2);
        greatest = Math.max(greatest,num3);

        System.out.println("Sum : " + nums + " \nGreatest number : " + greatest);
    }

}
