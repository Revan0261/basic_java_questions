package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(10,11,13,14,15);
        List<Integer> newData=data.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println(newData);
    }
}
//find odd  in  given numbers