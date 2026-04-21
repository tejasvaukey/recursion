public class Main {

    static void printN(int n) {
        if( n == 1 ) {
            System.out.print(n +" ");
            return;
        }
        printN(n-1);
        System.out.print(n +" ");

    }
    static void printNreverse(int n){
        if( n == 0 ) return;
        System.out.print(n + " ");
        printNreverse(n-1);
    }
    static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    static void fibonacci(int n){
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a +" ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    static int fib(int n){
        if(n == 0 || n == 1) {
            System.out.print(n +" ");
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    static int sOd(int n){
        if(n >= 0 && n <= 9) return n;
        return sOd(n/10) + n%10;
    }
    static int pow1(int p, int q){
        if(q == 0) return 1;
        return pow1(p, q-1) * p;
    }
    static int pow2(int p, int q){
        if(q == 0) return 1;
        if(q%2==0){
            int smallPow = pow2(p, q/2);
            return smallPow*smallPow;
        }
        int smallPow = pow2(p, q/2);
        return smallPow*smallPow*p;
    }
    static int seriesSum(int n){
        if(n == 0)return 0;
        return seriesSum(n-1) + n;
    }
    static void printMultiples(int n, int k){
        if(k == 0) return;
        printMultiples(n, k-1);
        System.out.print(n*k +" ");
    }
    static int seriesSumAlt(int n){
        if(n == 0) return 0;
        if(n%2 == 0) return seriesSumAlt(n-1) - n;
        return seriesSumAlt(n-1) + n;
    }
    static int iGCD(int a, int b){
        while(a%b !=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        if(a == 0 || b == 0) return 0;
        int gcd = gcd(a,b);
        return a*b/gcd;
    }

    static void main(String[] args) {
//        System.out.println(fibonacci(2));
        int s = lcm(45,15);
        System.out.println(s);
    }
}