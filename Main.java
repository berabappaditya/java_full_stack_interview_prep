import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;




public class Main{
      public static int findThirdLarge(List<Integer> arr){
        Collections.sort(arr);
        int l = arr.size();
        if(l<3){
            return -1;
        }
        int nth = 1;
        for(int i=l-2;i>=0;i--){
            if(!Objects.equals(arr.get(i), arr.get(i+1))){
                nth++;
            }
            if(nth == 3){
                return arr.get(i);    
            }
        }
        return -1;
    }
    public static void main(String[] args){
        List<Integer> arr = List.of(1,2,3,4,4,2,3);

        StreamTest testStream = new StreamTest();
        List<Integer> distinctList = testStream.makeListDistinct(arr);
        System.out.println(distinctList);
        List<Integer> oddlist = testStream.findOdds(distinctList);
        System.out.println(oddlist);
        long count = arr.parallelStream()
        .filter(n -> n > 3)
        .count();
       Thread t1 = new Thread(()->System.out.println("Hello"));
       t1.start();
   

}
        
        // List<Employee> employees = List.of(
        //     new Employee("Alice", 30, 101),
        //     new Employee("Bob", 25, 102),
        //     new Employee("Alice", 30, 101),  // Duplicate
        //     new Employee("Charlie", 28, 103),
        //     new Employee("Bob", 25, 102)       // Duplicate
        // );

        // HashMap<String, List<Employee>> employeeMap = new HashMap<>();



        // //Use distinct() to remove duplicates
        // List<Employee> uniqueEmployees = testStream.makeListDistinct(employees);

        // System.out.println("List without duplicates: " + uniqueEmployees);
        

        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // List<Integer> evenNumbers = numbers.stream()
        //     .filter((n) -> {
        //         System.out.println("Processing number: " + n); // Print each number
        //         boolean isEven = n % 2 == 0;    
        //         if (isEven) {
        //                 System.out.println("Even number found::::__> " + n); // Print even numbers
        //         }               // Check if it's even
        //         return isEven;                                 // Return true if even, else false
        //     })
        //     .collect(Collectors.toList());

        // System.out.println("Even numbers: " + evenNumbers);
        

    }