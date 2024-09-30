public class Pow{

    public static int power(int x, int k){  // T.C => O(n) S.C => O(n)

        if(k == 1) return x;
        
        
        // Base Case can be
        // if(k == 0){
        //     return 1;
        // }

        return x * power(x, k-1);
    }

    public static void main(String args[]){
        
        System.out.println(power(2, 6));
    }
}