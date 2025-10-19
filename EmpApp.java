import java.util.*;
class Employee implements Comparable<Employee>{
	int id;
	String name;
	int sal;
	
	public Employee(int id,String name,int sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public int compareTo(Employee emp){
		if(emp.id < this.id){
			return 1;
		}
		else if(emp.id > this.id){
			return -1;
		}
		else{
			return 0;
		}
	}
}

public class EmpApp{
	public static void main(String args[]){
		List <Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1,"vishal",2000));
		emp.add(new Employee(5,"Ankit",1000));
		emp.add(new Employee(3,"Rajesh",6000));
		emp.add(new Employee(2,"Asmita",9000));
		emp.add(new Employee(4,"Vaishnavi",500));
		
		Collections.sort(emp);
		for(Employee em : emp){
			System.out.printf("%d \t %-8s %d\n",em.id,em.name,em.sal);
		}
		
	}
}

