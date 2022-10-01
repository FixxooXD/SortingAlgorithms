import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] ;
            if (correct==arr.length){
                i++;
            }

          if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
}
