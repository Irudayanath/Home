import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {
	



	public static void main(String args[])
	{
		  Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
  
          ht.put(1,"hsh");
          ht.put(2,"ddds");
          
        	  Set s= ht.entrySet();
        	  
        	  Iterator it=s.iterator();
        	  while(it.hasNext())
        	  {
        		  if(ht.containsKey(1))
            	  {
            		  Map.Entry pair=(Map.Entry)it.next();
            		  System.out.print(pair.getValue());
            		  System.out.print(pair.getKey());
            	  }
        		  Map.Entry pair=(Map.Entry)it.next();
        		  System.out.println(pair.getKey());
        		  System.out.println(pair.getValue());
        		 
        	  }
          Set s1=ht.keySet();
          System.out.print(s1);
        	  
	}
}
