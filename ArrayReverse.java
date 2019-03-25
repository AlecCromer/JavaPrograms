public class ArrayReverse {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};

		//displays original
		for (int i = 0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}

		System.out.println("\n------");

		//reverses and displays the array reversed
		reverseArray(a);
		for (int i = 0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}
	}


	public static void reverseArray(int[] a){

		//swaps the last item in array with the first item after storing the value in temp
		for(int i = 0; i < a.length / 2; i++)
		{
		    int temp = a[i];
		    
		    a[i] = a[a.length - i - 1];
		    a[a.length - i - 1] = temp;

		}
	}
}
