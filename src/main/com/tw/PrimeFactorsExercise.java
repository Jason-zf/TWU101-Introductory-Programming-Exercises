package main.com.tw;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeFactorsExercise {
    public static void main(String[] args) {
        int n = 30;
        ArrayList<Integer> res = generate(n);
        for (int i = 0; i < res.size(); ++i) {
            System.out.print(res.get(i));
            if (i != res.size() - 1) {
                System.out.print(",");
            }
        }
    }

    private static ArrayList<Integer> generate(int n) {
        int upperLimit = (int) (Math.sqrt(n));
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= upperLimit; ++i) {
            if (n % i == 0 && isPrime(i)) {
                factors.add(i);
            }
        }
        Collections.sort(factors);
        return factors;
    }

    private static boolean isPrime(int n) {
        int limit = (int) (Math.sqrt(n));
        boolean flag = true;
        for (int i = 2; i < limit; ++i) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
