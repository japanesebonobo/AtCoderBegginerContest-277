package src;
import java.util.*;

public class A_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int P[] = new int[N];
        for (int i = 0; i < P.length; i++) {
            P[i] = scanner.nextInt();
            if (P[i] == X) {
                System.out.println(i+1);
            }
        }
        scanner.close();
    }
}