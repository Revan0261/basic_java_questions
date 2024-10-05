package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class I {
    public static void main(String[] args) {
        List<Employee> data = Arrays.asList(
                new Employee(1, "anjali", 2),
                new Employee(2, "monu", 4),
                new Employee(3, "kin", 4),
                new Employee(4, "aruu", 5));
        //1.List<Employee> collect = data.stream().filter(e -> e.getName().startsWith("a")).collect(Collectors.toList());
        // 2. List<Employee> collect = data.stream().filter(e -> e.getSal() > 3).collect(Collectors.toList());
        Map<Integer, List<Employee>> collect = data.stream().collect(Collectors.groupingBy(e -> e.getSal()));

        System.out.println(collect);

        //for each  use for 1 and 2
//        for (Employee EMP : collect){
//            System.out.println(EMP.getId());
//            System.out.println(EMP.getName());
//            System.out.println(EMP.getSal());
//        }


    }
}
