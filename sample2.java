package Collection2;
import java.util.HashMap;
public class sample2 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1060,"Jagan");
		hm.put(1062,"Raja");
		hm.put(1063,"Karthi");
		hm.put(1065,"Natarajan");
		hm.put(1085,"Pooja");
		int max=0;
		for(Integer x:hm.keySet()) {
			if(x>max) {
				max=x;
			}
		}
		System.out.println(max);
		for(String y:hm.values()) {
			if(y.length()%2==0) {
				System.out.println(y.toUpperCase());
			}
		}
		int mini=max;
		String b=" ";
		for(Integer z:hm.keySet()) {
			if(z<mini) {
				mini=z;
				b=hm.get(z);
				
			}
		}
		System.out.println(b.toUpperCase());
	}
}
