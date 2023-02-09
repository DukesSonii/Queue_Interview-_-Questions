import java.util.*;
public class Main
{
    public static void reversequeue(Queue<Integer> q){  
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());     //q se ele remove krke st mai push kro
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
    }
	public static void main(String[] args) {
	    Deque<Integer> dq = new LinkedList();
	    
	    dq.addFirst(1);
	    dq.addFirst(2);
	    dq.addLast(3);
	    dq.addLast(4);
	    
	    System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
	    
        System.out.println("first ele =" + dq.getFirst());
        System.out.println("first ele =" + dq.getLast());
	}
}



