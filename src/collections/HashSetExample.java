package collections;

import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,3,4,5,6);
        System.out.println(list);
       HashSet<Integer> hs =  new HashSet<>(list);
        System.out.println(hs);

    }
}
