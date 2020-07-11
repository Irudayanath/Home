import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HomePage {
	public static void main(String args[])
	{
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "java");
		m.put(2,"synxh");
        m.put(3, "check");
        Map<Integer, String> m1=Collections.synchronizedMap(m);
        Set s=m.entrySet();
        System.out.print(s);
        synchronized(m)
        {
        	Iterator i=s.iterator();
        	while(i.hasNext())
        	{
        		Map.Entry pair = (Map.Entry)i.next();
                System.out.print(pair.getKey() + ": ");
                System.out.println(pair.getValue());
        	}
        }
        
	}

}
