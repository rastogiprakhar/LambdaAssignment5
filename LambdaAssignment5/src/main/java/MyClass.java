import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyClass {
    public static void main(String[] args) {
        Function<List<String>,List<String>> distinctString= strings -> strings.stream().distinct().collect(Collectors.toList());
        List<String> list= distinctString.apply(Arrays.asList("java", "scala","java","clojure","clojure"));
        for(String s:list)
        {
            System.out.print(s+" ");
        }
    }
}
