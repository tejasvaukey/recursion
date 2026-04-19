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

    static void main(String[] args) {
//        System.out.println(fibonacci(2));
        fibonacci(5);
    }
}