import java.lang.reflect.Array;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr =  {5,2,6,9,8,4,};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j-1, j);
                } else {
                    break;
                }
            }
        }
    }

        static void swap(int[] arr,int first,int second){
            if(arr[first] > arr[second]){
                int temp= arr[first];
                arr[first]= arr[second];
                arr[second] = temp;
            }
        }
    }

