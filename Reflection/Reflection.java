//package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
public class Reflection {

     public static void main(String[] args) {
        try {
            // Obtain the Class object for Person
            Class<?> personClass = Class.forName("Person");

            // Print class name
            System.out.println("Class Name: " + personClass.getName());

            // Get all methods
            Method[] methods = personClass.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println(" " + method.getName());
            }

            // Get all fields
            Field[] fields = personClass.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println(" " + field.getName());
            }

            // Get all constructors
            Constructor<?>[] constructors = personClass.getDeclaredConstructors();
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(" " + constructor);
            }

            // Create an instance dynamically
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            Object personInstance = constructor.newInstance("John", 30);

            // Invoke the sayHello method
            Method sayHelloMethod = personClass.getMethod("sayHello");
            sayHelloMethod.invoke(personInstance); // Output: Hello, my name is John

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
