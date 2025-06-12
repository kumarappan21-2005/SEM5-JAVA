package Programs;
import java.util.ArrayList;
public class arrayds {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList();
		ar.add("KAVIN");
		ar.add('A');
		ar.add(10);
		ar.add("Kgcas");
		ar.add(86.78);
		ar.add(3,65);// replace in the specified index
		ar.set(4,"gki");//replace the word in the set 
	
		for(Object data:ar)
		{
			System.out.println(data);
		}
		System.out.println(ar.get(3));//shows the value in the index

	}

}
