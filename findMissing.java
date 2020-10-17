  
  /*
      Sort the array in ascending order and get the first element to mark the beginning of 
      the sequence. (Just in case the sequence of elements does not always start at 0 or 1)

      Loop through the array comparing each element to the increment of the previous element.
      If it is not, return the incremented value since it is the missing element in the sequence. 
  */
  
public int findMissing(int[] arr){
  Arrays.sort(arr);
  start = arr[0];
  for (int i = 0; i < arr.length; i++){
      if (arr[i] != start){
          return i;
      }else{
        start+=1;
      }
  }
}