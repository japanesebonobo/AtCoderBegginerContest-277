package src;
import java.util.*;

public class B_PlayingCardsValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ans = "No";

        int N = scanner.nextInt();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next();
        }
        scanner.close();

        int size = 0;
        Boolean flag = true;
        String condition1 = "HDCS";
        String condition2 = "A23456789TJQK";

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            char C[] = new char[2];
            C = S[i].toCharArray();
            if (condition1.contains(String.valueOf(C[0]))) {
                if (condition2.contains(String.valueOf(C[1]))) {
                    set.add(S[i]);
                    size++;
                } else {
                    flag = false;
                    break;
                }
            } else {
                flag = false;
                break;
            }
        }

        if (set.size() == size && size != 0 && flag == true) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}