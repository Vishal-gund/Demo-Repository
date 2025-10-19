/*

this demo program just use **************

Q6. Problem:
 Create a movie playlist using an ArrayList<String>. Perform the following operations:
Add 8 movies.
Display the playlist.
Remove all movies starting with letter "A".
Insert a new movie at index 2.
Reverse the playlist and display it.
Explanation:
Tests add(), removeIf(), add(index, element), Collections.reverse().
Demonstrates how ArrayList can be manipulated dynamically.
*/
import java.util.*;
public class MovieApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList <String> list = new ArrayList<>();
		
		while(true){
			System.out.println("Enter 1 for add movie");
			System.out.println("Enter 2 for display playlist");
			System.out.println("Enter 3 for remove ef letter starting with 'A' ");
			System.out.println("Enter 5 for Insert movie at given index");
			System.out.println("Enter 4 for reverse playlist");
			System.out.println("Enter 6 for exit aplication");
			System.out.println("Enter a choice:");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter a movie name");
					for(int i=0;i<=8;i++){
						list.add(sc.nextLine());
					}
					System.out.println("movie add succesfull");
				break;
				
				case 2:
				System.out.println("All list movie:");
					for(String movie:list){
						System.out.println(movie);
					}
				break;
				
				case 3:
					boolean found = false;
					for(String item :list){
						if(item.startsWith("A")){
							found = true;
						}
					}
					if(found){
						list.removeIf(item -> item.startsWith("A"));
						System.out.println("remove movie from starting 'A'");
					}
					else{
						System.out.println("Movie not found");
					}
				break;
				
				case 4:
					Collections.reverse(list);
					System.out.println("Display reverse succesfully");
				break;
				case 5:
					System.out.println("Enter a movei and ind ");
					int ind = sc.nextInt();
					sc.nextLine();
					String mName = sc.nextLine();
					list.add(ind,mName);
				break;
				case 6:
					System.out.println("Exit from aplication");
					System.exit(0);
				break;
				default:
					System.out.println("Enter a valid choice");
			}
		}
		
		
	}
}