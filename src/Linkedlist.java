
import java.util.LinkedList;

public class Linkedlist {
   
      public static void main(String[] args) {
       
          LinkedList<String> b = new LinkedList<>();
          
          b.add("Cabin crueser");
          b.addFirst("Banana ship");
          b.addLast("Brig");
          b.add(1,"Lesters baruto!");
          
          
          
          
          
          
          
          //ga wala wala sa kakapoy!
          //b.remove();
          //b.remove(1);
         b.removeFirst();
         b.removeLast();
          
          
          boolean containsBananaship = b.contains("Banana ship");
          System.out.println(containsBananaship);
                                           
          System.out.println("boats:" +b);
          System.out.println(b.size());
          System.out.println(b.getFirst());
          System.out.println(b.getLast());
          
    }
    
}
