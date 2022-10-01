import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr ={5,8,9,7};
         selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
//            find the maxvalue
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr,0,last);
           swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        if(arr[first] > arr[second]){
            int temp= arr[first];
              arr[first]= arr[second];
              arr[second] = temp;
        }
    }

    static int maxIndex(int[] arr,int start,int end){
        int maxIndex = start;
        for (int i=start; i<=end; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }return maxIndex;
    }
}
