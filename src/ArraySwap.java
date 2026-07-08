import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        swap(array,0,4);

        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] arr,int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
