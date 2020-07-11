import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class concurrent {
public static void main(String args[])
{
	ConcurrentHashMap<Integer,String> m=new ConcurrentHashMap<Integer,String>();
	
	m.put(1,"try");
	m.put(2, "hollo");
	m.put(3,"java");
	m.get(1);
	
	Iterator<Integer> i=m.keySet().iterator();
	synchronized(m)
	{
		while(i.hasNext())
		{
			System.out.println(m.get(i.next()));
		}
	}
}
}
