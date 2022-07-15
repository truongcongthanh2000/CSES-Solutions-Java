import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        WeirdAlgorithm solver = new WeirdAlgorithm();
        solver.solve(1, in, out);
        out.close();
    }

    static class WeirdAlgorithm {
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
}

