package CSES.IntroductoryProblems;

import java.util.Scanner;
import java.io.PrintWriter;

public class WeirdAlgorithm {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        while (n > 1) {
            out.print(n);
            out.print(' ');
            if (n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n /= 2;
            }
        }
        out.print(1);
    }
}
