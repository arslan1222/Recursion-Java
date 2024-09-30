public class Power{

    public static int power(int x, int k){

        if(k == 1){
            return x;
        }

        return x * power(x, k-1);
    }

    public static void main(String args[]){
        
        System.out.println(power(2, 1));
    }
}