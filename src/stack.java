
import java.util.Stack;

public class stack {
    
    public static void main(String [] args){
     Stack <Integer> l = new Stack<>();
     
     l.push(1);
     l.push(4);
     l.push(3);
     l.push(3);
     l.push(6);
     
     l.pop();
     
    
        System.out.println(l);
        System.out.println(l.peek());
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l);
    }
}
