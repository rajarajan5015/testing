package Collection2;
import java.util.*;
public class UseStudent {
	public static void main(String[] args) {
		Student n1=new Student("raj",19,"male",5015); 
		Student n2=new Student("anu",15,"female",5016); 
		Student n3=new Student("banu",28,"female",5017); 
		Student n4=new Student("manu",30,"male",5018); 
		Student n5=new Student("suban",16,"male",5013); 
		HashMap<Integer,Student>st=new HashMap<>();
		st.put(n1.getRollNo(), n1);
		st.put(n2.getRollNo(), n2);
		st.put(n3.getRollNo(), n3);
		st.put(n4.getRollNo(), n4);
		st.put(n5.getRollNo(), n5);
		HashMap<Integer,Student> stage=new HashMap<>();
		for(Student x:st.values()) {
			if(x.getAge()>25) {
				stage.put(x.getRollNo(),x);
				
			}
		}
		stage.forEach((x,y)-> System.out.println(x+" "+y));
/*		Iterator<Student>itr=st.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getAge()>=18) {
				itr.remove();
			}
		}
		st.forEach((z,x)->System.out.println(x));*/
	}
}