    import java.util.Scanner;
public class Triangle27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 5;
        for (int i = 1; i <= N; i++) {
            if(i==1 || i==N);

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
