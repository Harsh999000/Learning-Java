//Input in Java

//Import the required class files
import java.io.*; // for Buffered Reader
import java.util.InputMismatchException;
import java.util.Scanner; // for Scanner

public class Input {
        public static void main(String[] args) throws IOException {
                System.out.println("We have 2 basic ways to take input in java:\n" +
                                "1. Buffered Reader\n2. Scanner\n");
                System.out.println("Buffered input system is more complex than the Scanner " +
                                "input. However it is faster, provides more flexibity like limiting " +
                                "the input buffer size, more limit of the buffered size in case there " +
                                "is a larger input. Also the buffered inout is synchronized and hence " +
                                "should be preferred while performing multithreaded tasks.\n");
                System.out.println("For buffered reader input we need to handle IO exception. " +
                                "This execption is handled at the start of function. So the " +
                                "implementation looks like this:\n" +
                                "import java.io.*; //This is for buffered input\n" +
                                "import java.util.Scanner; // This is for scanner\n" +
                                "public class Test {\n" +
                                "   public static void main (String [] args) throws IOException {\n" +
                                "       Bufferedreader br = new BufferedReader (new Input Stream " +
                                "Reader (system.in))\n" +
                                "       String s1 = br.readline();\n" +
                                "       int x1 = Integer.parseInt(br.readline());\n" +
                                "       Scanner sc = new Scanner(System.in);\n" +
                                "       string s2 = sc.readline();\n" +
                                "       int x2 = sc.nextInt();\n" +
                                "   }\n" +
                                "}\n\n");

                // Implementataion of Buffered Reader Input
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Buffered Reader - Enter a String:");
                String s1 = br.readLine();
                System.out.println("\nBuffered Reader - Enter an Integer:");
                int x1 = Integer.parseInt(br.readLine());
                System.out.println("\nYou entered string:\n" + s1 + "\nand integer:\n" + x1 +
                                "\n");

                // Implementataion of Scanner Input
                Scanner sc = new Scanner(System.in);
                try {
                        System.out.println("Scanner Input - Enter a String:");
                        String s2 = sc.nextLine();
                        System.out.println("\nScanner Input - Enter an Integer:");
                        int x2 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\nYou entered string:\n" + s2 + "\n\nand " +
                                        "integer:\n" + x2 + "\n");
                        System.out.println("Now here we would need to enter one more " +
                                        "string input. This is because the nextInt() " +
                                        "method reds only the integer and leaves the " +
                                        "new line in the input buffer. So whenever we " +
                                        "take next input this left new line in the " +
                                        "buffer will be taken immediately instead of " +
                                        "waiting for a real user input. And since the " +
                                        "next input here in this program is a " +
                                        "nextInt(), which accepts a integer type " +
                                        "input and the immediate input received from " +
                                        "buffer is a new line, this will throw a run " +
                                        "time error like below:\n" +
                                        "Exception in thread \"main\" " +
                                        "java.util.NoSuchElementException\n");
                        System.out.println("We will take the extra line in buffer by " +
                                        "sc.nextLine();");
                } catch (InputMismatchException invalidInput) {
                        System.out.println("Invalid Input Recevived.\n");
                        sc.close();
                        return;
                }

                System.out.println("The difference in the efficiency comes because of the way " +
                                "these two works. The \u001B[1mscanner class\u001B[0m is a " +
                                "simpple text scanner that can parse primitive and strings. " +
                                "It internally works to read different types while on the " +
                                "other hand \u001B[1mBuffered\u001B[0m class reads text from " +
                                "a character-input stream, buffering characters so as to " +
                                "provide for the efficient reading of the sequence of " +
                                "characters.\n");
                System.out.println("In Scanner class if we call nextLine() method after any " +
                                "one of the seven nextXXX() method then the nextLine() does " +
                                "not read values from console and cursor will not come into " +
                                "console it will skip that step. The nextXXX() methods are " +
                                "nextInt(), nextFloat(), nextByte(), nextShort(), " +
                                "nextDouble(), nextLong(), next().\n");
                System.out.println("In BufferReader class there is no such type of problem. " +
                                "This problem occurs only for the Scanner class, due to " +
                                "nextXXX() methods ignoring newline character and nextLine() " +
                                "only reads till the first newline character. If we use one " +
                                "more call of nextLine() method between nextXXX() and " +
                                "nextLine(), then this problem will not occur because " +
                                "nextLine() will consume the newline character.\n");
                System.out.println("This happens because BufferedReader is synchronous " +
                                "while Scanner is not. BufferedReader should be used if we " +
                                "are working with multiple threads.\n");

                // Illustration of missing line while inouot via scanner
                try {
                        System.out.println("Below is the input way:\n" +
                                        "int x3 = sc.nextInt();\n" +
                                        "String s3 = sc.nextLine();\n");
                        System.out.println("Enter an integer:");
                        int x3 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\nEnter a string:");
                        String s3 = sc.nextLine();
                        System.out.println("Integer Entered: " + x3 + "\n" +
                                        "String Entered: " + s3 + "\n");
                } catch (Exception IOException) {
                        System.out.println("Invalid Input Recevived.\n");
                }

                // We need to close sc object of scanner or it will lead to resource leak
                sc.close();

                System.out.println("\nOne more thing to note here is that " +
                                "Scanner sc = new Scanner(System.in); is decalred " +
                                "outside and before try. You can declare it as below:" +
                                "\ntry (Scanner sc = new Scanner(System.in))\n" +
                                "The reason why we did not use this is because the " +
                                "try will close the Scanner and System.in along with " +
                                "the scanner. Now System.in once closed can not be " +
                                "reopened and hence will result in a run time error on " +
                                "the next try statement when we again try to take " +
                                "input.\nAlso, the scanner needs to be cloased as " +
                                "this can lead to a resource wastage, memory in this " +
                                "case i.e the memory assigned to System.in will be " +
                                "removed and utilised else where which would have " +
                                "else been released at the end of program.\n" +
                                "System.in is basically a representation of standard " +
                                "input stream which is typically connected to " +
                                "keyboard.\nThis allows program to read the input " +
                                "from console.\n");

        }
}