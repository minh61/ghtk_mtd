package Bai3;

public class Main {

    //kiem tra so Nguyen to
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        double mid = Math.sqrt(number);
        for (int i = 2; i <= mid; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // cach1: su dung while
    public static long cach1() {
        long sum = 0L;
        int i = 1;
        while (i <= 10000) {
            if(isPrime(i)) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    // cach 2: su dung do while
    public static long cach2() {
        long sum = 0L;
        int i = 1;
        do {
            if(isPrime(i))
                sum += i;
            i++;
        } while (i <= 10000);
        return sum;
    }

    // cach 3: su dung for
    public static long cach3() {
        long sum = 0L;
        for (int i = 1 ; i <= 10000 ; i++) {
            if( isPrime(i) ) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(cach1());
        System.out.println(cach2());
        System.out.println(cach3());
    }
}
