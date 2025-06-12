package Programs;
import java.util.HashMap;
import java.util.Map;
public class hash {
	public void avg(String name,int num){
		int t= num/5;
		System.out.println("the total average :"+t);
	}

	public static void main(String[] args) {
		int totalmark=0,i=1;
		double avg=0;
		hash h = new hash();
		HashMap<String,Integer> em=new HashMap();
		//      keys  values
		em.put("john",100);
        //      keys  values
		em.put("john", 200);
        //      keys  values
		em.put("marco", 350);
		for(int marks:em.values())
		{
			totalmark = totalmark+marks;
			
		}
		System.out.println("the total:"+totalmark);

		double average=totalmark/em.size();
		System.out.println("The average:"+avg);
		for(Map.Entry<String,Integer> entry :em.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}
