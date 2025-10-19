/*
Q.3
Create a menu-driven program using LinkedList where user can:

Add element

Remove element

Search element

Display all elements
*/
import java.util.*;
public class LinkedListApp{
	Scanner sc = new Scanner(System.in);
	
	public void addElement(LinkedList  <Integer> list){
		System.out.println("Enter a element");
		int num = sc.nextInt();
		list.add(num);
		
		System.out.println("Elements add succesfull");
	}
	
	
	public void removeElement(LinkedList  <Integer> list){
		System.out.println("Enter a remove Elements ind");
		int ind  = sc.nextInt();
		if(list.size() > 1){
			list.remove(ind);
		}
		System.out.println("Elements remove succesfull");
	}
	
	public void searchElement(LinkedList  <Integer> list){
		System.out.println("Enter a searchElement");
		int num = sc.nextInt();
		if(list.size() > 1){
			System.out.printf("Elements is = %d ",list.get(num));
		}
		else{
			System.out.println("LinkedList is empty");
		}
	}
	
	public void displayList(LinkedList  <Integer> list ){
		System.out.println("All list");
		
		for(int i=0;i<list.size();i++){
			System.out.printf("%d |",list.get(i));
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		LinkedList <Integer> list = new LinkedList <>();
		
		LinkedListApp link = new LinkedListApp();
		
		while(true){
			System.out.println("Enter 1 for addElement");
			System.out.println("Enter 2 for remove Elements");
			System.out.println("Enter 3 for search Element");
			System.out.println("Enter 4 display List");
			System.out.println("Enter a choice");
			
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("_____________________________");
					link.addElement(list);
					System.out.println("_____________________________");
					System.out.println();
				break;
				
				case 2 :
					System.out.println("_____________________________");
					link.removeElement(list);
					System.out.println("_____________________________");
					System.out.println();
				break;
				
				case 3:
					System.out.println("_____________________________");
					link.searchElement(list);
					System.out.println();
					System.out.println("_____________________________");
					System.out.println();
				break;
				
				
				case 4:
					System.out.println("_____________________________");
					
					link.displayList(list);
					System.out.println();
					System.out.println("_____________________________");
					System.out.println();
				break;
				default:
					System.out.println("_____________________________");
					System.out.println("Enter a valid choice");
					System.out.println("_____________________________");
					System.out.println();
				
			}
			
		}
	}
}