/*
Q10. Car Showroom Inventory
👉 Create a Car POJO with fields: carId, model, price, year.
 👉 Store multiple cars in ArrayList<Car>.
 👉 Display cars whose year is after 2020 and price below 10 lakh.
Explanation:
 Tests filtering with multiple conditions on an ArrayList.

*/
import java.util.*;
class Car{
	int carId;
	String model;
	int price;
	int year;
	
	public Car(int carId,String model,int price,int year){
		this.carId = carId;
		this.model = model;
		this.price = price;
		this.year = year;
	}
	
	public void setId(int carId){
		this.carId = carId;
	}
	public int getId(){
		return carId;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
}
class SortById implements Comparator<Car>{
	public int compare(Car c1,Car c2){
		if(c1.getId() > c2.getId()){
			return 1;
		}
		else if(c1.getId() < c2.getId()){
			return -1;
		}
		else{
			return 0;
		}
	}
}

class SortByprice implements Comparator<Car>{
	public int compare(Car c1 , Car c2){
		if(c1.getPrice() > c2.getPrice()){
			return 1;
		}
		else if(c1.getPrice() < c2.getPrice()){
			return -1;
		}
		else{
			return 0;
		}
	}
}
class SortByYear implements Comparator<Car>{
	public int compare(Car c1,Car c2){
		if(c1.getYear() > c2.getYear()){
			return 1;
		}
		else if(c1.getYear() < c2.getYear()){
			return -1;
		}
		else{
			return 0;
		}
	}
}

public class CarAppArr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList <Car> list = new ArrayList<>();
		list.add(new Car(1,"Swift",150000,2025));
		list.add(new Car(5,"BMW",1500000,2022));
		list.add(new Car(4,"Fortuner",5000000,2020));
		list.add(new Car(2,"MerciDice",2000000,2025));
		list.add(new Car(3,"Thar",1400000,2019));
		
		while(true){
			System.out.println("Enter 1 for whose car after 2020 and price more than 10lack");
			System.out.println("Enter 2 all car details sort id wise");
			System.out.println("Enter 3 car sort by price wise");
			System.out.println("Enter 4 car sort by year wise");
			System.out.println("Enter 5 for exit");
			System.out.println("Enter a choice");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.printf("%s \t %-10s %-10s %s\n","ID","Model","Price","Year");
					for(Car cr:list){
						if(cr.getYear()>2020 && cr.getPrice() < 1000000){
							System.out.printf("%d \t %-10s %-10d %d\n",cr.getId(),cr.getModel(),cr.getPrice(),cr.getYear());
						}
					}
					System.out.println("_________________________________________");
				break;
				case 2:
					System.out.println("Car details sort by id wise");
					Collections.sort(list,new SortById());
					System.out.printf("%s \t %-10s %-10s %s\n","ID","Model","Price","Year");
					for(Car cr : list){
						System.out.printf("%d \t %-10s %-10d %d\n",cr.getId(),cr.getModel(),cr.getPrice(),cr.getYear());
					}
					System.out.println("_________________________________________");
				break;
				
				case 3:
					System.out.println("Car details sort by price wise");
					Collections.sort(list,new SortByprice());
					System.out.printf("%s \t %-10s %-10s %s\n","ID","Model","Price","Year");
					for(Car cr : list){
						System.out.printf("%d \t %-10s %-10d %d\n",cr.getId(),cr.getModel(),cr.getPrice(),cr.getYear());
					}
					System.out.println("_________________________________________");
				break;
				
				case 4:
					System.out.println("Car details sort by year wise");
					Collections.sort(list,new SortByYear());
					System.out.printf("%s \t %-10s %-10s %s\n","ID","Model","Price","Year");
					for(Car cr : list){
						System.out.printf("%d \t %-10s %-10d %d\n",cr.getId(),cr.getModel(),cr.getPrice(),cr.getYear());
					}
					System.out.println("_________________________________________");
				break;
				
				case 5:
					System.out.println("Sorry we  exited from Application");
					System.out.println("_________________________________________");
					System.exit(0);
				break;
				default:
					System.out.println("Enter a valid choice");
					System.out.println("_________________________________________");
			}
		}
	}
}