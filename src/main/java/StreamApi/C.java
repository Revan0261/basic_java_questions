package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args){
        List<Integer> data= Arrays.asList(10,36,90,28,80);
        List<Integer>newData=data.stream().filter(x->x<50).collect(Collectors.toList());
        System.out.println(newData);
    }
}
//find greater than