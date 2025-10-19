import java.util.Scanner;
class Employee{
	private int id;
	private String name;
	private int salary;
	
	Employee(int id,String name,int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
}

public class MainAppEmp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Employee []emp= new Employee[5];
		for(int i=0;i<emp.length;i++){
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int salary = sc.nextInt();
			emp[i] = new Employee(id,name,salary);
				//emp[i].setId(id);
				//emp[i].setName(name);
				//emp[i].setSalary(salary);
		}
		
		System.out.printf("%s \t %-8s %s\n","ID","NAME","SALARY");
		for(int i=0;i<emp.length;i++){
			System.out.printf("%d \t %-8s %d\n",emp[i].getId(),emp[i].getName(),emp[i].getSalary());
		}
	}
}