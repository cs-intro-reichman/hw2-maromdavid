// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfRounds = Integer.parseInt(args[0]);
		double sum = 0.0;
	    for(double i = 0; i < numberOfRounds; i++)
                {
					if (i % 2 ==0) {
						sum += (1/(2 * i + 1));
					}
					else{
						sum -= (1/(2 * i + 1));						
					}
				}
				sum *= 4;
				System.out.println("pi according to Java: " +Math.PI);
				System.out.println("pi, approximated:     " +sum);	
	}
}
