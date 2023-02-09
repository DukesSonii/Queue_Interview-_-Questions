  import java.util.*;

public class Main
{   static class Queue {
        Deque<Integer> dq = new LinkedList<>();
        
        
        public void add(int data){
            dq.addLast( data);      //queue mai rear se data add kia
        }
        
        public int remove(){
            return dq.removeFirst();    //queue mai data font se remove hota h
        }
        
        public int peek(){
            return dq.getFirst();
        }
    }
	public static void main(String[] args) {
	    Queue q = new Queue();
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    //ye stack ye jcf wala stack nh h ye stack meri ek class ko implement krke use krna wala stack h
	
		System.out.println("peek = "+q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}
}

