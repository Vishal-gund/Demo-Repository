// its part of exception 

public class ArrayException{
	public static void main(String args[]){
		int arr [] = {1,2,3,4,5};
		try{
			int ind  = arr[arr.length];
			System.out.println(ind);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter valid ind");
			System.out.println(e);
		}
		System.out.println("Succefully achive exception");
	}
}