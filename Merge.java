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
    //mergesort()
  }

  public static int findSplit(int[] data){
    for (int i = 0; i < data.length; i++){
      if (data[i] > data[i+1]){
        return i;
      }
    }
    return data.length - 1;
  }

  public static void main(String[] args){

  }

}
