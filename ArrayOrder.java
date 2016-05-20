/* Bridgette Stranko
 * CSCI 315 - Data Structures
 * Program 1: Warmup
 */

/**
 * The enumerated data type Array Order
 * contains the direction and modification
 * needed for finding the neighbors of a 2D Array
 */
  public enum ArrayOrder {
    NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST;

  /**
   * The getColMod determines the value
   * to add to the column to get it to the
   * correct location in the 2D Array.
   *
   * @return The value to modify the column
   */
  public int getColMod () {
    int mod;
    switch (this) {
      case NORTHEAST:
        mod = 1;
        break;
      case EAST:
        mod = 1;
        break;
      case SOUTHEAST:
        mod = 1;
        break;
      case SOUTHWEST:
        mod = -1;
        break;
      case WEST:
        mod = -1;
        break;
      case NORTHWEST:
        mod = -1;
        break;
      default:
        mod = 0;
        break;
    }
    return mod;
  }

  /**
   * The getRowMod determines the value
   * to add to the row to get it to the
   * correct location in the 2D Array.
   *
   * @return The value to modify the row
   */
  public int getRowMod(){
    int mod;
    switch (this) {
    case NORTH:
      mod = -1;
      break;
    case NORTHEAST:
      mod = -1;
      break;
    case SOUTHEAST:
      mod = 1;
      break;
    case SOUTH:
      mod = 1;
      break;
    case SOUTHWEST:
      mod = 1;
      break;
    case NORTHWEST:
      mod = -1;
      break;
    default:
      mod = 0;
      break;
    }
    return mod;
  }
}