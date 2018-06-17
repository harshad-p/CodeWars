public class DescendingOrder {
  public static int sortDesc(final int num) {
    
    // get the number's digits separated into an array.
    int[] integerArray = getIntegerArray(num);
    
    // sort the digits in a descending order.
    bubbleSortDescending(integerArray);
    
    // return the number's array assembled back into an int.
    return assembleInt(integerArray);
  }
  
  /**
  * This method returns an array of integers, 
  * consisting of individual digits in the original integer number.
  */
  public static int[] getIntegerArray(int num){
    
    // convert the integer number to a string.
    String numString = String.valueOf(num);
    
    // to store the individual digits in the integer number
    int[] integerArray = new int[numString.length()];
    
    for(int i = 0; i < numString.length(); i++){
      // get the inidividual characters, and convert them to an int.
      integerArray[i] = Character.getNumericValue(numString.charAt(i));
    }
    
    return integerArray;
  }

  /**
  * This method sorts the input array of integers into
  * descending order, using Bubble Sort.
  */
  public static int[] bubbleSortDescending(int[] input){
    
    for(int i = 0; i < input.length; i++){
      for(int j = 0; j < input.length - 1; j++){
        if(input[j] < input[j + 1]){
          // move back the smaller number.
          int temp = input[j];
          input[j] = input[j + 1];
          input[j + 1] = temp;
        }
      }
    }
    
    return input;
  }

 /**
  * This method assembles the digits in the integer array 
  * into a number.
  */
  public static int assembleInt(int[] integerArray){
  
    // to store the digits as characters.
    char[] numChar = new char[integerArray.length];
    
    for(int i = 0; i < integerArray.length; i++){
      // get the character equivalent of the int, and cast it to a character.
      numChar[i] = (char)(integerArray[i] + '0');
    }
    
    // create a string form the character array.
    String numString = new String(numChar);
    
    // convert the string to an integer.
    return Integer.parseInt(numString);
  }
}
