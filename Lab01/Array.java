import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give an array: ");
        String my_array1 = scanner.nextLine();
        String[] num = my_array1.split(" ");
        int[] my_array2 = new int[num.length];
        
        for(int i = 0; i < num.length; i++){
            my_array2[i] = Integer.parseInt(num[i]);
        }
        Arrays.sort(my_array2);

        int sum = 0;
        System.out.print("The sorted array is: ");
        for(int j : my_array2){
            System.out.print(j + " ");
            sum += j;
        }
        int avg = sum/my_array2.length;

        System.out.println("\nSum of elements is: " + sum);
        System.out.println("Average of elements is: " + avg);
    }
}
