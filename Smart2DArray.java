/* Bridgette Stranko
 * CSCI 315 - Data Structures
 * Program 1: Warmup
 */

import java.util.Random;

/**
 * The <code>Smart2DArray</code> class creates
 * a 2D Array and initializes it with random
 * numbers.
 */

public class Smart2DArray {

  private int[][] numbers;

  /**
   *Create and initializes a 2D array with the given
   *number of rows and columns.  It does not
   *initialize the contents of the array.
   *
   *@param numCols The number of columns in the array
   *@param numRows The number of rows in the array
   * @exception NegativeArraySizeException Displays a message
   * if the array the size of the array is negative and exits.
   */
  public Smart2DArray (int numCols, int numRows) {
    try {
      numbers = new int[numRows][numCols];
    }
    catch (NegativeArraySizeException e) {
      System.out.println ("The array size must be a positive number");
      System.exit (0);
    }
  }

  /**
   *Initializes the contest of the array with a
   *set of random *non-negative* numbers.
   */
  public void initRandom () {
    Random randomNumbers = new Random();

    for (int row = 0; row < numbers.length; row++) {
      for (int col = 0; col < numbers[row].length; col++) {
        numbers[row][col] = randomNumbers.nextInt(100)+1;
      }
    }
  }

  /**
   * Returns a SmartArray with eight values. The values
   * are the values stored in the 8 neihbors of the
   * array cell at the given location in the Smart2DArray.
   *
   * @param col The column that contains the start location
   * @param row The row that contains the start location
   * @return A SmartArray object filled with the neighbors
   *         of the start location.
   */
  public SmartArray neighbors (int col, int row) {
    int count = 0;
    int num, nextCol, nextRow;
    SmartArray oneDimensionArray = new SmartArray(8);

    for (ArrayOrder order : ArrayOrder.values()) {
      nextRow = row + order.getRowMod();
      nextCol = col + order.getColMod();
      try {
        num = numbers[nextRow][nextCol];
        oneDimensionArray.insert (num, count);
      }

      catch (ArrayIndexOutOfBoundsException e) {
        oneDimensionArray.insert(-1, count);
      }
      count ++;
    }
    return oneDimensionArray;
  }

  /**
   * Assigns the value of the array to a String
   * variable.  Creates a new line after every
   * row.
   *
   * @return The string filled with the contents
   *         of the 2D Array
   */
  public String toString (){
    int count = 0;
    String arrayString = "ARRAY CONTAINS:\n";

    for (int row = 0; row < numbers.length; row++) {
      for (int col = 0; col < numbers[row].length; col++) {
        if (numbers[row][col] < 10)
          arrayString += numbers[row][col] + "   ";
        else if (numbers[row][col] < 100)
          arrayString += numbers[row][col] + "  ";
        else
          arrayString += numbers[row][col] + " ";
      }
      arrayString += "\n";
    }
    return arrayString;
  }

  /**
   * Retrieves the value of the array element.
   *
   * @param row The row of the array element.
   * @param col The column of the array element.
   * @return The value in the array element.
   * @exception ArrayIndexOutOfBounds Displays a message
   * if the position is out of bounds.
   */
  public int getNumber (int row, int col) {
    int number = 0;
    try {
      number = numbers[row][col];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("That is out of bounds!");
    }
    return number;
  }
}