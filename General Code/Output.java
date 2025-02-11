//Output in Java and Escaping Sequence

// How to write /n, / in the string

public class Output {
    public static void main(String[] args) {
        int x = 123;
        float y = 123.123f;
        double z = 12345.12345;
        System.out.println("There are basic 3 ways of output in java:\n" +
                "1. Using System.out.print()\n2. Using System.out.println()\n" +
                "3. Using System.out.printf() or System.out.format()\n");
        System.out.println("System.out.print() is used to print without appending a " +
                "new line at the end.\n");
        System.out.println("System.out.println() is used to print and move the cursor " +
                "to next line.\n");
        System.out.println("System.out.format() or System.out.printf() have same " +
                "function and they provide formatting capabilities.\n");

        // Demonstration of three different output ways
        System.out.println("Below is the demonstration of different output ways:\n");
        System.out.print("System.out.print(): Part 1: We need to manually");
        System.out.print("Part2: move cursor to new line using indent.\n");
        System.out.println("System.out.println(): Line 1");
        System.out.println("System.out.println(): Line 2\n");
        System.out.printf("System.out.printf(): int x = 123, float y = 123.123" +
                "double = 12345.12345\n");
        System.out.printf("int x = %d\n", x);
        System.out.printf("float y = %f\n", y);
        System.out.format("System.out.format() - This is same as printf()\n");
        System.out.format("double z = %f\n", z);
        System.out.format("We have the ability to control the number of digits to be " +
                "displayed using format or printf.\n");
        System.out.format("2 and 3 before after '.' z = %2.3f\n", z);
        System.out.format("6 and 6 before after '.' y = %6.6f\n", y);
        System.out.format("012 and 6 before after '.' y = %012.6f\n", y);
        System.out.format("05 and 09 before after '.' y = %05.09f\n", y);
    }
}