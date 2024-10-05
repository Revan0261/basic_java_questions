package StreamApi;

import java.util.function.Predicate;

public class A {
    public static  void main (String[] args){
        Predicate<Integer> val= l->l>100;
        boolean result =val.test(100);
        System.out.println(result);

    }
}
//Integer problem