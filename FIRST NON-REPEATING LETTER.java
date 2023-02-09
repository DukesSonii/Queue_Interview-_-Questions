import java.util.*;
public class Main
{
    public static void printnomnrepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            
            //queeue ke andar front pe check krna h ki first letter non repeating h ya nh
            //agar krta h toh priont krad do
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){  //peek kia hua char ki freq
                q.remove();
            }
            
            if(q.isEmpty()){
              System.out.print(-1+" ");
            } else {            //q ke front pe mera first non repeating char h
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
	public static void main(String[] args) {
	    String str = "aabccxb";
		printnomnrepeating(str);
	}
}

