
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public <T> List<T> makeListDistinct(List<T> list) {
        return list.stream().distinct().toList();
    }

    public List<Integer> findOdds(List<Integer> list){
        return list.stream().filter(n->n%2!=0).toList();

    }
    public List<Integer> findEven(List<Integer> list){
        return list.stream().filter(n->n%2==0).toList();

    }

}
