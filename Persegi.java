import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n= sc.nextInt();
        for (int h = 1; h <= n; h++) {
            for (int i = 1; i <= n; i++) {
                if (h==1 || h==n || i==1 || i==n) {
                    System.out.print(n + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
