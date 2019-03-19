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

  private static void mergesort(int[]data, int[]temp, int lo, int hi){
    if (lo >= hi) return;
    mergesort(data, low, (hi + lo) / 2);
    mergesort(data, (hi + lo) / 2, hi);
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


  public static void merge(int[] data, int[] first, int[] second) {
    int i = 0;
    int j = 0;
    for (int i = 0; i < data.length; i++) {
      if (i == first.length) {
        data[i] = second[j];
        j++;
      } else if (j == second.length) {
        data[i] = first[i];
        i++;
      } else {
        if (first[i] < second[j]) {
          data[i] = first[i];
          i++;
        } else {
          data[i] = second[j];
          j++;
        }
      }
    }
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
