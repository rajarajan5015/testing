 package Collection2;
import java.util.*;
import java.util.stream.*;
public class UseEmployee {
	public static void main(String[] args) {
		Employee emp1=new Employee("Raja",23,"male",35000,1062);
		Employee emp2=new Employee("Ragul",23,"male",33000,1063);
		Employee emp3=new Employee("Ranjani",28,"female",28000,1064);
		Employee emp4=new Employee("Ajay",23,"male",44000,1065);
		Employee emp5=new Employee("France",20,"male",38000,1066);
		Employee emp6=new Employee("Josh",21,"male",29000,1067);
		Employee emp7=new Employee("Suriya",23,"female",30000,1068);
		Employee emp8=new Employee("Manish",25,"male",54000,1069);
		HashMap<Integer,Employee> emp=new HashMap<>();
		emp.put(emp1.getId(), emp1);
		emp.put(emp2.getId(), emp2);
		emp.put(emp3.getId(), emp3);
		emp.put(emp4.getId(), emp4);
		emp.put(emp5.getId(), emp5);
		emp.put(emp6.getId(), emp6);
		emp.put(emp7.getId(), emp7);
		emp.put(emp8.getId(), emp8);
	/*	for(Employee x:emp.values()){
			if(x.getSalary()>25000&&x.getSalary()<40000) {
				x.setSalary(x.getSalary()+(x.getSalary()*5)/100);
			}
			else if(x.getSalary()>40000&&x.getSalary()<60000) {
				x.setSalary(x.getSalary()+(x.getSalary()*3)/100);
			}
			else if(x.getSalary()>=60000) {
				x.setSalary(x.getSalary()+(x.getSalary()*2)/100);
			}
		}
		emp.forEach((a,b)->{
			if(b.getGender().equals("female")) {
				System.out.println(b.getName());
			}
		});*/
	//	emp.forEach((a,b)->{ System.out.println(emp.get(a)); });
	/*	emp.forEach((x,y)->{
			if(y.getAge()<23){
			System.out.println(y);
		}
		});*/
	//	emp.keySet().forEach(a->{System.out.println(a);});
		emp.values().forEach(b->{
			if(b.getGender().equalsIgnoreCase("female")) {
				System.out.println(b.getName());
			}
		});
	/*	for(Integer x:emp.keySet()) {
			System.out.println(emp.get(x));
		}*/
	//	System.out.println(emp.get(emp7.getId()));
		
		
	}
}
