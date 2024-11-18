// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String theWord = args[1];
		String v = "v";
		if (theWord.equals(v)) {
			for(int i = 1; i <= seed; i++)
			{
				int counter = 1;
				int j = i;
			while (j != 1 || counter == 1) {
				counter++;
				if (j % 2 == 0) {
					System.out.print(j +" ");
					j = j / 2;
				} else{
					System.out.print(j +" ");
					j = (j * 3) + 1;
				}	
			}
			System.out.print("1 ");		
			System.out.println("(" +counter +")");	
		}
	}
	System.out.println("Every one of the first " +seed +" hailstone sequences reached 1.");
	}
}
