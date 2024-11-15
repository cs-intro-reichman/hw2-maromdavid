// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfRounds = Integer.parseInt(args[0]);
		double odd = 3.0;
		double sum = 1;
	    for(int i = 0; i < numberOfRounds; i++)
                {
					sum = sum - (1/odd);
					//System.out.println(1/odd);
					odd = odd + 2;
					sum = sum + (1/odd);
					//System.out.println(1/odd);
					odd = odd + 2;
					i ++;
				}
				System.out.println("pi according to Java: " +Math.PI);
				System.out.println("pi approximated: " +(Math.PI+(Math.PI/4)-sum));		
	}
}
