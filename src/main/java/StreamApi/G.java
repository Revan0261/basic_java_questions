package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class G {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(19, 78, 65, 43, 100);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max);
    }
}
