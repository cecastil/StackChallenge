import java.util.Stack;
import java.util.stream.*;

/**
 * the goal of this code is simulate a queue with two stacks
 */
public class Challenge {
    public static void main(String[] args) {


        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        Stream stream = s1.stream();
        stream.forEach((x -> {
            System.out.println(x);
        }));

        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());
        Stream strem = s2.stream();
        strem.forEach((x -> {
            System.out.println(x);
        }));
        
        Stack<String> s3 = new Stack<>();
        Stack<String> s4 = new Stack<>();
        
        s3.push("cesar");
        s3.push("samuel");
        s3.push("carlos");
        for (String i: s3
             ) {
            System.out.println(i);
        }
        
        
    }
}
