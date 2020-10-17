  /*
      Function accetps 2 args.
      1. The string to be reversed.
      2. The number of letter intervals to reverse the string by. 

        -> This is because requirements always change and thinking about that from
            the get go allows to cater for that with minimal refactoring. 
            eg. Reverse the string by 5 letter or 3 letter intervals instead of 4
  */
public String reverseByFour(String word, reverse_by){

    int word_length = word.length();  
    int max = (int) Math.floor(word_length/reverse_by); //Get the total number of intervals to be made for the string 
    int start = 0;
    int finish = 0;
    char[] charArray = word.toCharArray();

    for (int i = 1; i <= max; i++){ //Loop just as many times as the intervals for the string.
        finish = start + reverse_by;
        StringBuilder reversed_letters = new StringBuilder(); 
        reversed_letters.append(word.substring(start, finish)).reverse();
        
        for (int j = 0; j < reverse_by; j++){
          charArray[start + j] = reversed_letters.charAt(j);
        }

        start += reverse_by;
    }
    return charArray
}
