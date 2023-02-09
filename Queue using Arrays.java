
public class Main
{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        
        Queue(int n ){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        
        public static boolean isEmpty(){
            return rear == -1;          //no ele in queue i.e queue is empty
        }
        
        public static void  add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear+=1;
            arr[rear] = data;
        }
        
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
             int front = arr[0];         //phle store kra lo
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear -= 1;
            return front;
        }
        
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            
            return arr[0];      //arrr[0] = front
        }
    }
	public static void main(String[] args) {
	    Queue q = new Queue(5);
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    
	    while(!q.isEmpty()){
	        System.out.println(q.peek());
	        q.remove();
	    }
	}
}

