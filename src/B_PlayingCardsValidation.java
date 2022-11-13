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

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            char C[] = new char[2];
            C = S[i].toCharArray();
            if (C[0] == 'H' || C[0] == 'D' || C[0] == 'C' || C[0] == 'S') {
                if (C[1] == 'A' || C[1] == '2' || C[1] == '3' || C[1] == '4' || C[1] == '5' || C[1] == '6' || C[1] == '7' || C[1] == '8' || C[1] == '9' || C[1] == 'T' || C[1] == 'J' || C[1] == 'Q' || C[1] == 'K') {
                    set.add(S[i]);
                    size++;
                } else {
                    flag = false;
                }
            } else {
                flag = false;
            }
        }

        if (set.size() == size && size != 0 && flag == true) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}