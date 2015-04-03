package nyc.c4q.theaulait;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;

import java.util.HashSet;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(57);

    HashSet<Integer> newodd = new HashSet<Integer>();
    HashMap<String, Integer> fruitCount = new HashMap<String, Integer>();
        fruitCount.put("bananas", 3);
        fruitCount.put("apples", 99);
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit);


    HashSet<Integer> even = new HashSet<Integer>();
        even.add(2);
        even.add(4);

        odd.removeAll(even);

    //    for (Integer num: even){
    //        odd.add(num);
    //    }

    //    for (Integer num :odd){
    //        System.out.println(num);
        }


    }
}
