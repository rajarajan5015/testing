package Collection2;

public class Employee {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(String name, int age, String gender, int salary, int id) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + ", id=" + id
				+ "]";
	}
}