// This file takes in two user inputs as arguments and outputs the result from a harmonic series

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double H = 0.0;

        for (int ii = 1; ii <= n; ii++) {
            H = H + 1 / (Math.pow(ii, r));
        }

        System.out.println(H);
    }
}

