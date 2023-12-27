package com.promineotech;

import java.util.Arrays;

public class Week4Assignment {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Instructions...

// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
   // a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result 1.a: " + result);
   // b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more
        	// i. Make sure that there are 9 elements of type int in this new array.
        	// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
        	// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
        int[] ages2 = new int[9];
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result 1.b: " + result2);
   // c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("Result 1.c: " + "Average Age: " + average);
// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
   // a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Result 2.a: " + "Average Number of Letters per Name: " + averageLetters);

   // b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        String concatenatedNames = "";
        for (String name : names) {
            concatenatedNames += name + " ";
        }
        System.out.println("Result 2.b: " + "Concatenated Names: " + concatenatedNames.trim());

// 3. How do you access the last element of any array?
        int[] numbers = {10, 20, 30, 40, 50};
        // Access the last element of the numbers array
        int lastElement = numbers[numbers.length - 1];
        System.out.println("Result 3: " + "Last Element of the Numbers Array: " + lastElement);
// 4. How do you access the first element of any array?
        int firstElement = numbers[0]; // Using the same array as #3
        System.out.println("Result 4: " + "First Element of the Numbers Array: " + firstElement);
// 5. Create a new array of int called nameLengths.
        int[] nameLengths = new int[names.length];
        // Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        // Print the nameLengths array
        System.out.println("Result 5: " + "Name Lengths Array: " + Arrays.toString(nameLengths));
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        // int[] nameLengths (PREVIOUSLY USED, BUT USING IT IN A DIFFERENT WAY)

        // Calculate the sum
        for (int length : nameLengths) {
            sum += length;
        }
        System.out.println("Result 6: " + "Sum of name lengths: " + sum);
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        String concatenated = concatenateWord("Hello", 3);
        System.out.println("Result 7: " + concatenated);

// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name.
        System.out.println("Before calling getFullName method"); //troubleshooting only
        String fullName = getFullName("Mike", "Johns");
        System.out.println("After calling getFullName method"); //troubleshooting only

        // Print the result
        System.out.println(fullName);
    
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        int[] testArray = {30, 40, 35};
        boolean result9 = isSumGreaterThan100(testArray);
        System.out.println("Result 9: " + result9);
    	
    
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
    	double[] doubleArray = {10.5, 20.3, 15.8, 25.2};
    	double averageDouble = calculateAverage(doubleArray);
    	System.out.println("Result 10: " + "Average of doubleArray: " + averageDouble);
    	
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        double[] firstArray = {10.5, 20.3, 15.8, 25.2};
        double[] secondArray = {5.5, 15.3, 12.8, 20.2};

        boolean result11 = isAverageGreater(firstArray, secondArray);
        System.out.println("Result 11: " + result11);
    	
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        boolean isHotOutside = true;
        double moneyInPocket = 15.75;

        boolean result12 = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println("Result 12: " + result12);
    	
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    	// Create an array of names
    	String[] exampleNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank"};

    	// Call the findLongestName method
    	String longestName = findLongestName(exampleNames);

    	// Print the result to the console
    	System.out.println("Result 13: " + "Longest Name: " + longestName);
    	}   
    
//*********Methods used in support of solutions above*********    
    // Method to concatenate word n times (used for question 7)
    public static String concatenateWord(String word, int n) {
        if (n < 0) {
            return "Invalid input: Please provide a non-negative value for n.";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }

        return result.toString();
    }
    // Method to getFullName (used for question 8)
    public static String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return "Result 8: " + fullName;
    }
    // Method for boolean isSumGreaterThan100, support for #9
    public static boolean isSumGreaterThan100(int[] array) {
    	int sum = 0;
    	for (int value : array) {
    		sum += value;
    	}
    	return sum > 100;
    }
    // Method to calculateAverage, support for #10
    public static double calculateAverage(double[] array) {
        if (array.length == 0) {
            // Handle the case where the array is empty to avoid division by zero
            return 0.0;
        }

        double sum = 0;
        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }
    // Method for isAverageGreater, support for #11
    public static boolean isAverageGreater(double[] firstArray, double[] secondArray) {
        double averageFirst = calculateAverage(firstArray);
        double averageSecond = calculateAverage(secondArray);

        return averageFirst > averageSecond;
    }
    // Method to check if the person will buy a drink, support for #12
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        // Assuming a drink costs 10.50, adjust this value based on the actual cost
        double drinkCost = 10.50;

        return isHotOutside && (moneyInPocket > drinkCost);
    }   
    //Method to Find the longest name in an Array, support for #13
    public static String findLongestName(String[] names) {
        // Check if the array is not empty
        if (names == null || names.length == 0) {
            return "Array is empty or null";
        }
        
        // Initialize the longest name with the first name in the array
        String longestName = names[0];

        // Iterate through the array starting from the second name
        for (int i = 1; i < names.length; i++) {
            String currentName = names[i];

            // Compare the length of the current name with the length of the longest name
            if (currentName.length() > longestName.length()) {
                // If the current name is longer, update the longestName variable
                longestName = currentName;
            }
        }

        // Return the longest name
        return longestName;
    }
}
