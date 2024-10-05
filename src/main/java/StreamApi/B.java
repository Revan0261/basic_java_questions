package StreamApi;

import java.util.function.Predicate;

public class B {
    public static void main(String[] args){
        Predicate<String> val= x->x.equals("Re1");
        boolean result=val.test("Re1");
        System.out.println(result);
    }
}
//String problem