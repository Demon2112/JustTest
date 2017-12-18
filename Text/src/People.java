//import java.io.*;
public class People {
	
	public People() {
		
	}
	int peopleAge;
	String name;
	String designation;
	double salary;
	public People(String name) {
		System.out.println("\nname:"+ name);
		this.name = name;
	}
	public void setAge(int age) {
		this.peopleAge = age;
	}
	
	public void setDesignation(String design) {
		designation = design;
	}
	
	public void setSalary(double salar) {
		salary = salar;
	}
	
	public void printPeople() {
		System.out.print("\nname			:" + name);
		System.out.print("\nage			:" + peopleAge);
		System.out.print("\ndesignation	:" + designation);
		System.out.print("\nsalary		:" + salary);
	}
	
	public int getAge(){
		System.out.printf("\nage : " + peopleAge);
		return peopleAge;
	}
	
	public static void main (String []args) {
//		System.out.print("Hello World");
		People jj = new People("kede Han");
		
		jj.setAge(32);
		int age = jj.getAge();
		System.out.print("\n人的年龄: " + age);
		
		int a = 10;
		long b;
		b = a;
		System.out.println("\n"+ b);
		float c = 12.0f;
		
		double d = 232.323;
		char cd = 'd';
		
		System.out.println("哈哈哈哈或哈");
		
	}
}
