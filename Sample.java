package Collection2;
import java.util.HashMap;
public class Sample {
	public static void main(String[] args) {
		HashMap<String,Long> hm=new HashMap();
		hm.put("mani",9486790057l);
		hm.put("raja",8870530104l);
		for(String k:hm.keySet()) {
			System.out.println(k);
			System.out.println(hm.get(k));
		}
		for(Long l:hm.values()) {
			System.out.println(l);
			
		}
	}

}
