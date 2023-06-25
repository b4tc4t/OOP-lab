import java.util.Scanner;
public class DisplayTriangle {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Please give a number: ");
        int n = number.nextInt();
    
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++) System.out.print(" ");
            for(int k = n-i+1; k <= n+i-1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
