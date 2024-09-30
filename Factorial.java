public class Factorial{

    public static int printFact(int n){   // Time Complexity -> O(N) // S.C -> O(N)

        if(n == 0){
            return 1;
        }

        int fn = n * printFact(n-1);
        return fn;
    }

    // Sum of natural numbers
     public static int sunOfNaturalNum(int n){   // Time Complexity -> O(N) // S.C -> O(N)

        if(n == 1){
            return 1;
        }

        int fn = n + sunOfNaturalNum(n-1);
        return fn;
    }

    public static void main(String args[]){

        int n = 6;
        System.out.println(printFact(n));
        System.out.print(sunOfNaturalNum(n));

    }
}