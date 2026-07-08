import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }


    static void reverse(int[] array){
        int start = 0;
        int end = array.length -1;
        while(start < end){
            swap(array,start,end);
            start++;
            end--;
        }
    }


    static void swap(int[] arr,int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
