package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int[] no_array = {2,3,5,8,8,3,2,1,10,12,11};
        System.out.println("Unsorted Array:");
        //for(int i = 0; i<no_array.length; i++)
            System.out.println(Arrays.toString(no_array));
        no_array = insertion_sort(no_array);
        System.out.println("Sorted Array:");
       // for(int i = 0; i<no_array.length; i++)
        System.out.println(Arrays.toString(no_array));
    }

    private static int[] insertion_sort(int[] no_array) {
        int temp;
        for(int i=0; i<no_array.length-1;i++){
            for(int j=i+1; j<no_array.length;j++)
            {
                if(no_array[i]>no_array[j]){
                    temp = no_array[i];
                    no_array[i] = no_array[j];
                    no_array[j] = temp;
                }
            }
        }
        return no_array;
    }
}
