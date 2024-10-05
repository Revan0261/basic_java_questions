package StreamApi;

import javax.xml.stream.XMLInputFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class J {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 23, 56, 87, 23);
        int result= data.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}