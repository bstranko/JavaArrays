/* Bridgette Stranko
 * CSCI 315 - Data Structures
 * Program 1: Warmup
 */

import java.util.Random;

/**
 * The <code>SmartArray</code> class creates an array.
 */
public class SmartArray {
  private int[] numbers;

  /**
   * Creates and initializes an array.
   * It does not initialize the contents of the array.
   *
   * @param n The size the array will be initialized to.
   * @exception NegativeArraySizeException Displays a message
   * if the array the size of the array is negative and exits.
   */
  public SmartArray (int n) {
    try {
      numbers = new int[n];
    }
    catch (NegativeArraySizeException e) {
      System.out.println("The array size must be a positive number");
      System.exit(0);
    }
  }

  /**
   * Retrieves the number of elements in an array
   *
   * @return The number of elements in the array
   */
  public int getLength () {
    return numbers.length;
  }

  /**
   * Initializes the contents of the array with random
   * non-negative numbers
   */
  public void initRandom () {
    Random randomNumbers = new Random ();
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = randomNumbers.nextInt(100)+1;
    }
  }

  /**
   * Allows client code to add an element to the array
   * at the given position.
   *
   * @param value The value assigned to the array element
   * @param pos The position of the array element
   * @exception ArrayIndexOutOfBounds Displays a message
   * if the position is out of bounds.
   */
  public void insert (int value, int pos) {
    try {
      numbers[pos] = value;
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("That is out of bounds");
      System.out.println("There are only " + numbers.length +
                    " elements in this array.");
    }
  }

  /**
   * The find method searches for a value in the array.
   *
   * @param target The number that is being searched for.
   * @return The position of target if target is
   * one of the values in the array, otherwise -1.
   */
  public int find (int target) {
    int index = 0;
    int position = -1;
    boolean found = false;

    while (!found && index < numbers.length) {
      if(numbers[index] == target) {
        found = true;
        position = index;
      }
      index++;
    }
    return position;
  }

  /**
   * The recursiveFind method searches for a
   * value in the array using recursion
   *
   * @param target The number that is being searched for.
   * @return The helper method for the recursive find
   */
  public int recursiveFind (int target) {
    return recursiveFind (target, 0, numbers.length - 1);
  }

  /**
   * The recursiveFind method is a helper method
   *
   * @param target The number that is being searched for
   * @param index The element that is being searched
   * @param position Used to record the element number.
   * @return The position of target if target is
   * one of the values in the array, otherwise -1.
   */
  public int recursiveFind (int target, int index, int position) {
    if(position == -1) {return position;}
    else if (numbers[index] == target) {return index;}
    else {
      return recursiveFind(target, index + 1, position - 1);
    }
  }


  /**
   * Stores the elements of the array in a string
   * an formats the elements of the array, seperated by
   * spaces, with a newline after every 10 elements.
   *
   * @return The string that contains the formatted elements.
   */

  public String toString () {
    int count = 0;
    String arrayString;

    arrayString = "ARRAY CONTAINS:\n";

    for (int index = 0; index < numbers.length; index++) {
      if (count < 10) {
        if (numbers[index] < 10)
          arrayString += "  " + numbers[index] + " ";
        else if (numbers[index] < 100)
          arrayString += " " + numbers[index] + " ";
        else
          arrayString += numbers[index] + " ";
        count++;
      }
      else {
        if(numbers[index] < 10)
          arrayString += "\n  " + numbers[index] + " ";
        else if(numbers[index] < 100)
          arrayString += "\n " + numbers[index] + " ";
        else
          arrayString += "\n" + numbers[index] + " ";
        count = 1;
      }
    }
    return arrayString;
  }
}