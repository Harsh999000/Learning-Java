//Introduction to Java

public class Introduction_To_Java {
    public static void main(String[] args) {
        System.out.println("Java is an Object Oriented Programming " +
                "Language.It Works with the concept that everything under the " +
                "sun is an Object. This is mainly used for building desktop, web and " +
                "Mobile Applications\n");
        System.out.println("JDK - Java Development Kit - is a Kit that" +
                "provides an environment to develop and executed a java program.\n");
        System.out.println("JDK contains a private JVM (Java Virtual " +
                "Machine) interpreter/loader (java), a compiler (Javac), " +
                "an archiver (jar), a documentataion generator (Javadoc), etc, " +
                "to complete the development of a Java Application.\n");
        System.out.println("JRE - Java Runtime Environment - This provides " +
                "a mininmum requirement for executing a Java application.\n");
        System.out.println("It consists of JVM, core classes and supporting " +
                "files. It works with three basic parts - Specification, " +
                "Implementor, Runtime Instance\n");
        System.out.println("A Specification is where the working of Java " +
                "Virtual Machine is specified.\n Implementor is a computer program " +
                "that meets the requirement of the JVM specification.\n" +
                "Runtime Instance is a JVM instance which is created whenever you " +
                "write a java command on the command prompt to run the java class.\n");
        System.out.println("JVM - Java Virtual Machine - This is an abstract " +
                "virtual machine because it does not ists physically, but it is " +
                "a specification that provides a secure runtime environment to " +
                "execute the bytecode generateed by the javac (Java compiler), " +
                "JVM is responsible to invoke the main() method present in the " +
                "program.");
        System.out.println("When we compile a Java Program, it converts the java " +
                "program file to a higjly optimized class file which is called " +
                "bytecode\n");
        System.out.println("Java Program Execution is completed with the help of the " +
                "following - Classloader, Bytecode Verifier, Interpreter\n");
        System.out.println("Classloader loads the class file for the JVM execution\n");
        System.out.println("Bytecode Verifier, verifies the bytecode and restricts " +
                "object from access to other parts of the system.\n");
        System.out.println("Interpreter reads the bytecode instructions " +
                "and executes them line by line.\n");
        System.out.println("Since the Byte code verifier restricts the access " +
                "Java provides security by confining Java Programs " +
                "to Java Execution Environment.\n");
        System.out.println("Since the program is converted into a common format " +
                "of bytecode which is then used by JVM to run the program " +
                "Java also provides platrform independency. Which means once you " +
                "write a program, you can run it anywhere, where JDK is present.\n");
    }
}