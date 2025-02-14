// Next Greater Element
// Previous Greater Element
// Next Smaller Element
// Previous Smaller Element
// Last Next Greater Element
// Last Previous Greater Element
// Last Next Smaller Element
// Last Previous Smaller Element

// Greatest rectangle in a bar graph
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

class Greater_And_Smaller_Element_Variation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input Start
        int sizeOfArray;
        System.out.print("Enter the size of the array = ");

        sizeOfArray = scanner.nextInt();

        int[] array = new int[sizeOfArray];

        System.out.println("\nEnter the elements of the array:");

        // Input of array
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        // Print to verify input of array
        System.out.print("\nArray Entered = ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i] + " ,");
        }

        // Input End

        System.out.println("\n\n");

        // Create Object for the Implementataion Class

        Implementataion object = new Implementataion();

        System.out.println("Next Greater Element Array = " + object.nextGreaterElement(array));
        System.out.println("\n");
        System.out.println("Previous Greater Element Array = " + object.previousGreaterElement(array));
        System.out.println("\n");
        System.out.println("Next Smaller Element Array = " + object.nextSmallerElement(array));
        System.out.println("\n");
        System.out.println("Previous Smaller Element Array = " + object.previousSmallerElement(array));
        System.out.println("\n");

        // Largest Rectangle in a bar graph

        int[] previousSmallerElementIndex = object.previousSmallerElementIndex(array);
        int[] nextSmallerElementIndex = object.nextSmallerElementIndex(array);
        // We store this in a new array because in java the refernce is passed when
        // returned via array, now this will not give the exact value
        // Alos if we use object of the class to directly call function in a loop
        // this will lead to multiple execution of that loop which could give us
        // wrong results
        System.out.println("previous Smaller Index = " + Arrays.toString(previousSmallerElementIndex));
        System.out.println("next Smaller Index = " + Arrays.toString(nextSmallerElementIndex));

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (nextSmallerElementIndex[i] == -1) {
                System.out.println("Greatest rectangle at i = "
                        + (array.length - previousSmallerElementIndex[i] - 1) * array[i]);
                if (max < ((array.length - previousSmallerElementIndex[i] - 1) * array[i])) {
                    max = ((array.length - previousSmallerElementIndex[i] - 1) * array[i]);
                }
            } else {
                System.out.println("Greatest rectangle at i = "
                        + (nextSmallerElementIndex[i] - previousSmallerElementIndex[i] - 1) * array[i]);
                if (max < ((nextSmallerElementIndex[i] - previousSmallerElementIndex[i] - 1) * array[i])) {
                    max = ((nextSmallerElementIndex[i] - previousSmallerElementIndex[i] - 1) * array[i]);
                }
            }
        }

        // This is done because when arr length = 1, previous and next smaller index
        // both is -1
        // as per the formula it will be (arr.length - previousSmallerElementIndex[i] +
        // 1) * arr [i]
        // this gives (1 - (-1) + 1) * arr[i] = 3 * arr[i]
        if (array.length == 1) {
            System.out.println("Greatest Rectangle Area = " + array[0]);
        } else {
            System.out.println("Greatest Rectangle Area = " + max);
        }
        scanner.close();
    }
}

class Implementataion {

    // Next Greater Element
    public ArrayList<Integer> nextGreaterElement(int[] array) {

        // Declare array list to return
        // ArrayList<Integer> ans = new ArrayList<Integer>();

        // We use the below to initialise all the elements to zero so that we
        // can save a loop to initialse all the remaning elements to -1
        ArrayList<Integer> ans = new ArrayList<Integer>(Collections.nCopies(array.length, -1));

        // Implementation of function

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < array.length; i++) {

            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && array[stack.peek()] < array[i]) {
                    // array[stack.peek()] = array[i];
                    // The above would have been required if we had to use while loop
                    // to assign all the elements to array list again
                    // We can only use this to set and not directly add
                    // as the index would not be defined in normal declaration
                    // ArrayList<Integer> ans = new ArrayList<Integer>();
                    // But Collecations.nCopies assign all the elemnts as -1
                    ans.set(stack.peek(), array[i]);
                    stack.pop();
                }
                stack.push(i);
            }
        }

        /*
         * // Not required as we have now directly preset all the elements to -1
         * while (!stack.isEmpty()) {
         * array[stack.peek()] = -1;
         * ans.set(stack.peek(), -1);
         * stack.pop();
         * }
         */

        /*
         * // The below is not required as all the elements of the array liust was
         * // initialised to -1 and the lements requiring change were directly set to
         * // the value in the for loop itself
         * // To add all the elements of the array to array list
         * for (int i : array) {
         * ans.add(i);
         * }
         */

        // Return ans
        return ans;
    }

    // Previous Greater Element
    public ArrayList<Integer> previousGreaterElement(int[] array) {

        // Declare array list to return
        ArrayList<Integer> ans = new ArrayList<Integer>(Collections.nCopies(array.length, -1));

        // Implementation of function

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = (array.length - 1); i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && array[stack.peek()] < array[i]) {
                    ans.set(stack.peek(), array[i]);
                    stack.pop();
                }
                stack.push(i);
            }
        }

        // Return ans
        return ans;
    }

    // Next Smaller ELement
    public ArrayList<Integer> nextSmallerElement(int[] array) {

        // Declare array list to return
        ArrayList<Integer> ans = new ArrayList<Integer>(Collections.nCopies(array.length, -1));

        // Implementation of function

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && array[stack.peek()] > array[i]) {
                    ans.set(stack.peek(), array[i]);
                    stack.pop();
                }
                stack.push(i);
            }
        }

        // Return ans
        return ans;
    }

    // Previous Smaller Element
    public ArrayList<Integer> previousSmallerElement(int[] array) {

        // Declare array list to return
        ArrayList<Integer> ans = new ArrayList<Integer>(Collections.nCopies(array.length, -1));

        // Implementation of function

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = (array.length - 1); i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && array[stack.peek()] > array[i]) {
                    ans.set(stack.peek(), array[i]);
                    stack.pop();
                }
                stack.push(i);
            }
        }
        // Return ans
        return ans;
    }

    // Implementataion of previous smaller element index - for largest rectangle at
    // i
    public int[] previousSmallerElementIndex(int[] array) {
        int[] index = new int[array.length];
        Arrays.fill(index, -1);
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = (array.length - 1); i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && array[stack.peek()] > array[i]) {
                    index[stack.peek()] = i;
                    stack.pop();
                }
                stack.push(i);
            }
        }

        // Return index array - This will return the refernnce of array in java
        return index;
    }

    // Implementation of next smaller element index - for largest rectangle at i
    public int[] nextSmallerElementIndex(int[] array) {
        int[] index = new int[array.length];
        Arrays.fill(index, -1);
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && array[stack.peek()] > array[i]) {
                    index[stack.peek()] = i;
                    stack.pop();
                }
                stack.push(i);
            }
        }

        // Return Index Array - This will return the refernce of arrya in java
        return index;
    }

}