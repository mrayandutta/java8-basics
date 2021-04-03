package corejava.objectsamples;

public class Employee {
	private String  name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Peter");
		employee.setAge(30);
		employee.setCountry("US");
		System.out.println(employee);
		//System.out.println(Test.);
	}

}
