//Wrapper Classes

public class Wrapper_Classes {
    public static void main(String[] args) {
        System.out.println("We have primitive data types and for every primitive data " +
                "type we have a wrapper class. This is to allow the creation of " +
                "objects primitive data types.\n");
        System.out.println("The wrapper classes are required as we have few " +
                "implementations which is based on creation of objects of wrapper " +
                "classes such as generics and collections.\n");
        System.out.println("We try to make most of the data types as references in " +
                "java for better security. However we do require primitive data types " +
                "for more efficiency as refrences have one more extra layer so it is " +
                "slower than primitive data types.\n");
        System.out.println("Now the primitive data types directly stores the values.\n");
        System.out.println("However, non-primitive stores the reference i.e address " +
                "of where the data is stored.\n");
        System.out.println("Below are the few primitive data types and their wrapper " +
                "clasess:\n");
        System.out.println("1. char - Character \n " +
                "2. byte - Byte \n" +
                "3. short - Short \n" +
                "4. int - Integer \n" +
                "5. long - Long \n" +
                "6. float - Float \n" +
                "7. double - Double \n" +
                "8. boolean - Boolean \n");

        // Example

        int x1 = 10;
        Integer x2 = new Integer(10);
        System.out.println("For example, in the below, the x1 stores the value 10:\n" +
                "int x1 = 10;\n" + "Value of x1 = " + x1 + " \n" +
                "and mentioned below, x2 stores the address where the value 10 is " +
                "stored.\n" +
                "Integer x2 = new Integer (10)\n" + "The 10 is the argument passed.\n" +
                "Value of x2 = " + x2 + " \n");
    }
}