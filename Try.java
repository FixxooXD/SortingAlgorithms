import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 9, 4,};{
            bubble(arr);
            System.out.println(Arrays.toString(arr));
           // System.out.println(swap(arr,0,2));
        }
    }
   static void bubble(int[] arr){
        for (int i=0;i<arr.length;i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
//                      swap(arr,j-1,j);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }
        }
   }

//   static void selection(int[] arr){
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length-i;j++){
//
//            }
//        }
//   }

   static int max(int[] arr,int start,int end){
        int maxIndex =start;
        for (int i=start;i<=end;i++){
            if(arr[i]>arr[start]){
                maxIndex =i;
            }
            return i;
        }
       return maxIndex;
   }
   static void swap(int[] arr,int first,int second){
        if (arr[first] > arr[second]){
            int temp=arr[second];
            arr[first]= arr[second];
            arr[first] = temp;
       }

   }
}