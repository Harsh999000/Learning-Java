// Comment one Line

/*
 This is how you comment multiple lines 
 */

//The name of the file and the public class where main function is present needs to be same in the java
public class HelloWorld
{
    /*
     * This is the main function, this is where the Java program execution starts.
     * We keep the main function as public because this needs to be accessed outside this package and outside this by the JVM while runing tbe program.
     * Static functions are special functions which can be called without creating objects.
     * Main is made static aleays because the JVM does not want to create an Object of this class and run this method. JVM simply wants to call this function
     * void is the return type of main
     * "String []"" - This is the argument which is an array of strings
     * This is done in main so that you can pass strings at command line.
     * "args" is the name of ther array of strings declared in the arguments of main function
     * System.out.println - "System" is class it is a standard java class. "out" is an object inside system class, it is an object of Print stream.
     * Print stream is used to print something on the screen.
     * "println" is a method inside the Print Stream Class, 
     */
    public static void main (String [] args)
    {
        System.out.println("Hello World");
    }

}