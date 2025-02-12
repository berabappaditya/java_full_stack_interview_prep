

import java.util.ArrayList;
import java.util.List;

//package collections.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        arr.forEach(ele -> System.out.println(ele));        
    }
    
}
