package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class H {
        public static void main(String[] args) {
            List<Integer> data = Arrays.asList(19, 34, 78, 23, 17);
            Optional<Integer> max = data.stream().max(Integer::compareTo);
            System.out.println(max);


        }
    }