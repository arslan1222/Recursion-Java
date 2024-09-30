public class Fibonacci{

    public static int fibonacci(int n){
        
        if(n == 0 || n == 1){
            return n;
        }
        
        int f = fibonacci(n-1) + fibonacci(n-2);

        return f;

    }
    public static void main(String args[]){

        int n = 4;
        System.out.println(fibonacci(n));
    }
}