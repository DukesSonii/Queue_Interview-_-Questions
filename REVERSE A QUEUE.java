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
	    Queue<Integer> q = new LinkedList();
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    q.add(4);
	    q.add(5);
	    
	    reversequeue(q);
	    
	    while(!q.isEmpty()){
	        System.out.println(q.remove()+" ");
	    }
	}
}



