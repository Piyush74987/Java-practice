package Arrays.Sorting;

import java.util.*;

public class try_sorting {
    public static void main(String[] args) {
        int [] arr ={1,4,2,5,3};
        System.out.println(sort(arr));

    }

    public static  String sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return (Arrays.toString(arr));
    }
}
