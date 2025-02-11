//Data Types and Variables

//Created class Point to show how non-primitive data works with reference
class Point {
        int x;
        int y;
}

public class Data_Types_And_Variables {

        // Info of Data Types
        public static void main(String[] args) {

                System.out.println("There are two types of variables - Primitive and " +
                                "Non-Primitive\n");
                System.out.println("Primitive Data Types include int, char, byte etc\n");
                System.out.println("Non-Primitive Data Types include String, Array, objects " +
                                "of the user defined classes.");
                System.out.println("Any data point inside a user defined class is a " +
                                "non-primitive data type. Howvere non-primitive data types can be " +
                                "present in user defined or system classes.\n");
                System.out.println("Non-Primitive Data Types are always references. This " +
                                "means that they store the address to the location of the value. \n");
                System.out.println("Non-Primitive Data Type is Stored on Heap, while " +
                                "primitive data types are stored on stack.\n");
                System.out.println("The memory for non-primitive data types are allocated " +
                                "dynamically. Howvere the primitive data types are allocated static " +
                                "memory.\n");
                System.out.println("If we do not initialize a value for non-primitive data " +
                                "then it stores a default value as 0 and it's couter part for all " +
                                "data types.");
                System.out.println("However if you try to access the primitive data types " +
                                "without initializating them, the you get a compiler error.\n");
                System.out.println("There are further three tpes of variable:\n");
                System.out.println("1. Local Variable\n2. Instance Variable\n3. Static Variable\n");
                System.out.println("Local Variables arer the variable defineed with a block " +
                                "or method or constructor. These are created when the block or " +
                                "function is called and are destroyed after the exit. It is " +
                                "mandatory to initiaze the variable.\n");
                System.out.println("Instance Variable are non-static variaables in a class outside " +
                                "any method, constructor or block. They are not mandatory to " +
                                "initialize. They can be accessed by creeating an object outtside the " +
                                "class they have been declared in.\n");
                System.out.println("Static variables are also known as class variables. They are " +
                                "declared in similar way to instance variables, only a keyword static is " +
                                "added within a class outside any method, constructor, or block. " +
                                "We can have only one copy of any static method irrespective of how " +
                                "many objects we create for a class. These are created at the time of " +
                                "initiation of program and are destroyed once the program ends. " +
                                "If we access the static variable like the Instance variable " +
                                "(through an object), the compiler will show the warning message " +
                                "and it won't halt the program. The compiler will replace the " +
                                "object name with the class name automatically. If we access " +
                                "the static variable without class name, the compiler will " +
                                "automatically append the class name.\n");
                System.out.println("Lets look at some data types and their sizes and limits:\n");
                System.out.println("Bollean - Value is True or False.\n");
                System.out.println("Size of boolean is JVM-dependent typically 1 bit or 1 byte");
                System.out.println("Size of the boolean is JVM-dependent (1bit or 1 byte)\n");
                System.out.println("Byte ranges from -2^7 to 2^7-1 and it's size is " +
                                Byte.SIZE + "bits. \n");
                System.out.println("short ranges from -2^15 to 2^15-1 and it's size is " +
                                Short.SIZE + " bits.\n");
                System.out.println("int ranges from -2^331 to 2^31-1 and it's size is " +
                                Integer.SIZE + " bits.\n");
                System.out.println("long ranges from -2^63 to 2^63-1 and it's size is " +
                                Long.SIZE + " bits.\n");
                System.out.println("float is a data type with 7 decimals precision. It's " +
                                "size is " + Float.SIZE + " bits.");
                System.out.println("float is a data type with 15 decimals precision. It's " +
                                "size is: " + Double.SIZE + " bits.");
                System.out.println("Size of char: " + Character.SIZE + " bits. It is 16 bits " +
                                "to accomodate unicode characters, i.e outside of English Language.");

                // Exmaple to show how reference works in a non-primitive data type

                Point p1 = new Point();
                Point p2 = p1;

                p1.x = 10;
                p1.y = 20;

                System.out.println("Now, below is the example of how the reference works " +
                                "in a non-primitive data class.\n");
                System.out.println("We have created a class Point, with two int variables " +
                                "x and y. And here is how we access the variable.\n");
                System.out.println("Point p1 = new Point();\n" + "P1 is the object of Point " +
                                "class.\n");
                System.out.println("Point p2 = p1\n" + "P2 is a new object of Point " +
                                "class which has the same reference as p1.\n");
                System.out.println("p1.x = " + p1.x + "\n" + "p1.y = " + p1.y + "\n");
                System.out.println("Since p1.x and p1.y store the address where this value " +
                                "will be stored.\n");
                System.out.println("p2.x = " + p2.x + "\n" + "p2.y = " + p2.y + "\n");
                System.out.println("Since p2.x and p2.y store the address " +
                                "where this value will be stored. They will fetch the default value\n");

                p2.x = 30;
                System.out.println("Now if we do,\n p2.x = 30;\nThis basically referes to the " +
                                "same address where the value of Point class object was stored.\n");
                System.out.println("So the Value of x should now be upated even without " +
                                "refering to the first object p1, because both the objects are of " +
                                "same class");
                System.out.println("Hence below is the new value: \n");
                System.out.println("p1.x = " + p1.x);
                System.out.println("p1.y = " + p1.y);
                System.out.println("p2.x = " + p2.x);
                System.out.println("p2.y = " + p2.y);
        }
}