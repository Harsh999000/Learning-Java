//Auto Boxing and Unboxing

public class Auto_Boxing_And_Unboxing {
    public static void main(String[] args) {
        System.out.println("Autoboxing is taking a primitive data and putting a " +
                "refernce cover on it. Example:\n " +
                "int a =10;\n" +
                "Integer b = a; \n");
        System.out.println("Unboxing a taking a refrenced data and removing the cover " +
                "of reference data by storing it directly in a primitive data type. " +
                "Example:\n" +
                "int c = b;");

        // Difference of storing data in a primitive and non-primitive format
        System.out.println("Below is the demonstration of the difference of " +
                "Auto Boxing and Unboxing:\n" +
                "Integer a = 400, b = 400;\n" +
                "Now if we check the below statement:\n" +
                "If (a==b)\n    System.out.println(\"Same\");\nelse\n    " +
                "System.out.println(\"Not Same\"\n\n" +
                "Here the output will be \"Not Same\" because these are 2 different " +
                "objects. Now if the value is small, java sometimes directly save the " +
                "literal in the cache so this might result in \"Same\", if the value " +
                "was small, however if you increase this enough the output will " +
                "not be same.");

        Integer a = 10, b = 10, c = 400, d = 400;
        int x = 10, y = 10;

        System.out.println("Below is the demo:\n" +
                "Integer a = 10, b = 10, c = 400, d = 400;\n" +
                "int x = 10, y = 10;\n");

        if (a == b) {
            System.out.println("a and b are same.\n");
        } else {
            System.out.println("a and b are not same.\n");
        }

        if (c == d) {
            System.out.println("c and d are same.\n");
        } else {
            System.out.println("c and d are not same.\n");
        }

        if (x == y) {
            System.out.println("x and y are same.\n");
        } else {
            System.out.println("x and y are not same.\n");
        }
        System.out.println("Below we have if and esle condition to determine if the " +
                "value is same or not. The object referenced data will not be same " +
                "even though their values are same because they aare different " +
                "objects. However if the value is small then java might store the " +
                " literal in cache and might result in same. However of primitive " +
                " data will always be the same. The limit for cache for objects is " +
                "-128 to 127 in Java 8 and above.");
    }
}