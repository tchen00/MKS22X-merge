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
  public static void mergesort(int[]data){
    return;
  }

  private static void mergesort(int[]data, int[]temp, int lo, int hi){
    if (lo >= hi) return;
    mergesort(data, temp, low, (hi + low) / 2);
    mergesort(data, temp, (hi + low) / 2, hi);

    //mergesort()
  }

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



  public static int[] subArr(int[] data, int start, int end){
    int[] ary = new int[end-start];
    return ary;
  }

/*
  public static int findSplit(int[] data){
    for (int i = 0; i < data.length; i++){
      if (data[i] > data[i+1]){
        return i;
      }
    }
    return data.length - 1;
  }
*/
  public static void main(String[] args){
    /*
    int[] data = {2,3,4,1,2,3};
    System.out.println(findSplit(data));
    */
  }

}
