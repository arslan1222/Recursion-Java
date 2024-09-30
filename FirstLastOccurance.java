public class FirstLastOccurance{

    public static int firstOccurance(int arr[], int i){

        if(i == arr.length){
            return -1;
        }

        int x = 5;

        if(arr[i] == x){
            return i;
        }

        return firstOccurance(arr, i+1);
    }

    public static int lastOccurance(int arr[], int i){
        int x = 2;

        if(i == arr.length-1){
            return -1;
        }

        int isFound = lastOccurance(arr, i+1);
        if(isFound != -1){
            return isFound;
        }

        if(arr[i] == x){
            return i;
        }

        return isFound;
    }

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,2,6};

        // System.out.println(firstOccurance(arr, 0));
        System.out.println(lastOccurance(arr, 0));
    }
}