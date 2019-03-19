import java.util.*;
import java.io.*;

public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  /*
    PSEUDOCODE from website:
      mergesort(data,lo,hi):
        if lo >= hi :
          return
        mergesort left side
        mergesort right side
        merge
 */
  public static void mergesort(int[] data){
    int lo = 0;
    int hi = data.length - 1;
    mergesort(data, lo, hi);
  }

  private static void mergesort(int[]data, int lo, int hi){
    if(lo >= hi) return;
    int mid = data.length / 2;
    // LEFT ARRAY --------------------------------
    int[] left = new int[mid];
    for(int i = 0; i < left.length; i++){
      // copying left side the new left array
      left[i] = data[i];
    }
    mergesort(left, 0, left.length - 1); // recursive call on left side
    // RIGHT ARRAY --------------------------------
    int[] right = new int[data.length - mid];
    for(int i = 0; i < right.length; i++){
      // copying right side the new right array
      right[i] = data[mid + i];
    }
    mergesort(right, 0, right.length - 1); // recursive call on right side
    // MERGING TWO HALVES
    merge(data, left, right);
  }
/*
  private static void mergeH(int[] data){
    int middle = data.length / 2;
    int[] left = new int[middle];
    int[] right = new int[data.length - middle];
    // looping through the left side
    for (int i = 0; i < middle; i++){
      left[i] = data[i];
    }
    // looping through the right side
    for (int j = middle; j < data.length; j++){
      second[j - middle] = data[j];
    }

    if (left.length > 1) {
      mergeH(left);
    }
    if (right.length > 1) {
      mergeH(right);
    }
    merge(data, left, right);
  }
*/

  public static void merge(int[] data, int[] left, int[] right) {
    // variables for left, right and current data index
    int i = 0;
    int leftI = 0;
    int rightI = 0;

    // when looping through both sides
    while(leftI < left.length && rightI < right.length){
      // if left is less than or equal to right
      if (left[leftI] <= right[rightI]){
        data[i] = left[leftI];
        leftI++;
      }
      else{
        data[i] = right[rightI];
        rightI++;
      }
      i++;
    }

    //if left is not done yet
    while(leftI < left.length){
      data[i] = left[leftI];
      i++;
      leftI++;
    }

    //if right is not done yet
    while(rightI < right.length){
      data[i] = right[rightI];
      i++;
      rightI++;
    }
  }

/*
  public static int[] subArr(int[] data, int start, int end){
    int[] ary = new int[end-start];
    return ary;
  }

  public static int findSplit(int[] data){
    for (int i = 0; i < data.length; i++){
      if (data[i] > data[i+1]){
        return i;
      }
    }
    return data.length - 1;
  }
*/
public static void main(String[]args){
  //USING MR. K'S sort from last time 
  System.out.println("Size\t\tMax Value\tmerge/builtin ratio ");
  int[]MAX_LIST = {1000000000,500,10};
  for(int MAX : MAX_LIST){
    for(int size = 31250; size < 2000001; size*=2){
      long qtime=0;
      long btime=0;
      for(int trial = 0 ; trial <=5; trial++){
        int []data1 = new int[size];
        int []data2 = new int[size];
        for(int i = 0; i < data1.length; i++){
          data1[i] = (int)(Math.random()*MAX);
          data2[i] = data1[i];
        }
        long t1,t2;
        t1 = System.currentTimeMillis();
        Merge.mergesort(data2);
        t2 = System.currentTimeMillis();
        qtime += t2 - t1;
        t1 = System.currentTimeMillis();
        Arrays.sort(data1);
        t2 = System.currentTimeMillis();
        btime+= t2 - t1;
        if(!Arrays.equals(data1,data2)){
          System.out.println("FAIL TO SORT!");
          System.exit(0);
        }
      }
      System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
    }
    System.out.println();
  }
}

}
