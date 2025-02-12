
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("A", 1);
        hmap.put("B", 2);
        hmap.put("C", 3);

        hmap.forEach((key, value) -> System.out.println(value + key));

}

}
