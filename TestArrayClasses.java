//Bridgette Stranko
//CSCI 315 - Data Structures
//Program 1: Warmup

import java.util.Scanner;

/**
 * The <code>TestArrayClasses</code>
 * tests the SmartArray and Smart2DArray.
 */
public class TestArrayClasses {

  public static void main (String [] args) {
    int number, position, col, row;
    SmartArray oneDimensionArray;
    Smart2DArray twoDimensionArray;

    Scanner keyboard = new Scanner(System.in);

    // Display a welcome message
    System.out.println ("Hello! This program tests the SmartArray and " +
   			"Smart2DArray classes.");

    // Create a smart array with 25 elements
	 System.out.println ("\nLets create a single dimension array with 25 elements");
	 oneDimensionArray = new SmartArray(25);

    // Display the numbers in the array
	 System.out.println("There are now " + oneDimensionArray.getLength() +
					" elements in this array");

	 // Fill the array with random numbers and display it
	 System.out.println ("\nLet's fill this array with random numbers!");
	 oneDimensionArray.initRandom ();
	 System.out.println (oneDimensionArray.toString());

	 // Try to fill the array with index that is out of bounds
	 System.out.println ("\nLet's see what happens when we try to insert 50 into " +
					"element 25 in the array.");
	 oneDimensionArray.insert(50, 25);
	 System.out.println (oneDimensionArray.toString());

	 // Fill the array's last element
	 System.out.println ("\nLet's see what happens when we try to insert 50 into " +
				"element 24 in the array.");
	 oneDimensionArray.insert (50, 24);
	 System.out.println (oneDimensionArray.toString());

	 // Search for a number using the find method in SmartArray class
	 System.out.println ("\nLet's search for a number using the find method");
	 	 System.out.print ("Enter the number you want to lookup: ");
	 number = keyboard.nextInt ();
	 position = oneDimensionArray.find (number);
	 if (position == -1)
	   System.out.println ("Sorry! That number is not in the list\n");
	 else
	   System.out.println ("That is in the array element #" + position + "/n");

	 // Search for a number using the findRecursive method in SmartArray class
	 System.out.println ("Let's search for a number using the recursive method");
	 System.out.print ("Enter the number you want to lookup: ");
	 number = keyboard.nextInt ();
	 position = oneDimensionArray.recursiveFind(number);
	 if (position == -1)
	   System.out.println ("Sorry! That number is not in the list\n");
	 else
	   System.out.println ("That is in the array element #" + position+ "\n");

	 // Display a message informing the user that we are now working with
	 // 2D Array
	 System.out.println ("That was fun! Now let's create a 2D array");
	 System.out.println ("and fill it with random numbers\n");

    // Get the number of columns and rows from the user
  	 System.out.print ("Enter the number of columns: ");
	 col = keyboard.nextInt ();
  	 System.out.print ("Enter the number of rows: ");
	 row = keyboard.nextInt ();

    // Create the Smart2DArray using the input from the user
  	 twoDimensionArray = new Smart2DArray (col, row);
	 twoDimensionArray.initRandom ();

	 // Print the elements in the array
	 System.out.println (twoDimensionArray.toString());

  	 // Display a message letting them know we are going to find the neighbors
  	 // of the element they chose. Get the column and row of the element
  	 System.out.println( "\nLet's create a new array that consists of " +
				"neighbors of a position you chose.");
 	 System.out.print ("Enter the column of the position you chose: ");
	 col = keyboard.nextInt();
	 System.out.print ("Enter the row of the position you chose: ");
	 row = keyboard.nextInt();

	 // Display the number they chose and create a new SmartArray using the
	 // neighbors method in Smart2DArray using the users input
	 System.out.println ("You chose " + twoDimensionArray.getNumber(row, col));
 	 SmartArray newArray = twoDimensionArray.neighbors (col, row);

	 // Display the new SmartArray that contains the neighbors
	 System.out.println (newArray.toString());

	 // Display a message that let's the user know the program is over.
	 System.out.println ("That's All Folks! Goodbye!" );
	 System.exit (10);
	}
}

/*--------------------Test Run #1----------------------------------------------------
 Hello! This program tests the SmartArray and Smart2DArray classes.

 Lets create a single dimension array with 25 elements
 There are now 25 elements in this array

 Let's fill this array with random numbers!
 ARRAY CONTAINS:
  33  44  10  50  96  22  15  95  32  41
  76   2  75  85  69  48  79   1  58  52
  55  98  71  49  18

 Let's see what happens when we try to insert 50 into element 25 in the array.
 That is out of bounds
 There are only 25 elements in this array.
 ARRAY CONTAINS:
  33  44  10  50  96  22  15  95  32  41
  76   2  75  85  69  48  79   1  58  52
  55  98  71  49  18

 Let's see what happens when we try to insert 50 into element 24 in the array.
 ARRAY CONTAINS:
  33  44  10  50  96  22  15  95  32  41
  76   2  75  85  69  48  79   1  58  52
  55  98  71  49  50

 Let's search for a number using the find method
 Enter the number you want to lookup: 50
 That is in the array element #3

 Let's search for a number using the recursive method
 Enter the number you want to lookup: 1
 That is in the array element #17

 That was fun! Now let's create a 2D array
 and fill it with random numbers

 Enter the number of columns: 5
 Enter the number of rows: 20
 ARRAY CONTAINS:
 92  15  100 96  47
 82  81  94  48  77
 35  47  67  13  79
 42  91  69  93  60
 16  50  64  34  87
 77  72  65  88  37
 99  34  73  75  82
 13  77  76  97  1
 76  70  78  99  3
 3   31  1   60  79
 42  38  27  22  93
 76  4   11  27  69
 88  83  61  58  27
 37  4   29  45  2
 8   59  10  70  43
 84  77  63  88  60
 100 18  13  58  1
 76  56  38  96  89
 73  92  28  89  27
 64  82  93  82  54


 Let's create a new array that consists of neighbors of a position you chose.
 Enter the column of the position you chose: 1
 Enter the row of the position you chose: 1
 You chose 81
 ARRAY CONTAINS:
  15 100  94  67  47  35  82  92
 That's All Folks! Goodbye!

--------------------Test Run #2----------------------------------------------------
Hello! This program tests the SmartArray and Smart2DArray classes.

Lets create a single dimension array with 25 elements
There are now 25 elements in this array

Let's fill this array with random numbers!
ARRAY CONTAINS:
 73  48  89  22  25  66  78  85  83  38
 41   2  95  65  33  18 100   9  76  30
  4  73  55  92  89

Let's see what happens when we try to insert 50 into element 25 in the array.
That is out of bounds
There are only 25 elements in this array.
ARRAY CONTAINS:
 73  48  89  22  25  66  78  85  83  38
 41   2  95  65  33  18 100   9  76  30
  4  73  55  92  89

Let's see what happens when we try to insert 50 into element 24 in the array.
ARRAY CONTAINS:
 73  48  89  22  25  66  78  85  83  38
 41   2  95  65  33  18 100   9  76  30
  4  73  55  92  50

Let's search for a number using the find method
Enter the number you want to lookup: 99
Sorry! That number is not in the list

Let's search for a number using the recursive method
Enter the number you want to lookup: 99
Sorry! That number is not in the list

That was fun! Now let's create a 2D array
and fill it with random numbers

Enter the number of columns: 10
Enter the number of rows: 15
ARRAY CONTAINS:
46  20  90  49  86  87  67  79  56  3
40  47  79  84  54  57  33  15  88  78
17  95  68  3   96  51  63  72  21  52
90  28  98  59  14  11  58  64  37  100
86  10  55  24  1   75  26  3   28  22
5   34  56  44  72  55  29  81  71  66
19  89  46  28  72  55  5   22  18  14
73  31  64  79  68  11  76  55  35  65
87  29  34  85  25  32  53  31  9   59
43  39  80  14  60  54  34  55  9   69
9   1   87  66  79  56  45  80  20  29
79  40  32  33  31  18  75  51  31  9
26  15  1   72  64  59  3   50  75  88
100 65  92  56  93  27  37  32  89  18
16  93  98  7   98  90  9   50  87  60


Let's create a new array that consists of neighbors of a position you chose.
Enter the column of the position you chose: 5
Enter the row of the position you chose: 6
You chose 55
ARRAY CONTAINS:
 55  29   5  76  11  68  72  72
That's All Folks! Goodbye!
Press any key to continue . . .

--------------------Test Run #3----------------------------------------------------
Hello! This program tests the SmartArray and Smart2DArray classes.

Lets create a single dimension array with 25 elements
There are now 25 elements in this array

Let's fill this array with random numbers!
ARRAY CONTAINS:
 76   9  42  93  84  17  59  83  84  37
 86  62  83  23  55  63  12  35  84  31
 63  60  59   8  27

Let's see what happens when we try to insert 50 into element 25 in the array.
That is out of bounds
There are only 25 elements in this array.
ARRAY CONTAINS:
 76   9  42  93  84  17  59  83  84  37
 86  62  83  23  55  63  12  35  84  31
 63  60  59   8  27

Let's see what happens when we try to insert 50 into element 24 in the array.
ARRAY CONTAINS:
 76   9  42  93  84  17  59  83  84  37
 86  62  83  23  55  63  12  35  84  31
 63  60  59   8  50

Let's search for a number using the find method
Enter the number you want to lookup: 5
Sorry! That number is not in the list

Let's search for a number using the recursive method
Enter the number you want to lookup: 5
Sorry! That number is not in the list

That was fun! Now let's create a 2D array
and fill it with random numbers

Enter the number of columns: 1
Enter the number of rows: -3
The array size must be a positive number
Press any key to continue . . .

--------------------Test Run #4-------------------------------------------------

Hello! This program tests the SmartArray and Smart2DArray classes.

Lets create a single dimension array with -25 elements
The array size must be a positive number
Press any key to continue . . .

*/