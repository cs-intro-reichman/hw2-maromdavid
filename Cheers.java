// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String theWord = args[0];
                int numberOfRounds = Integer.parseInt(args[1]);
                if (numberOfRounds <= 0) {
			System.out.println("Please enter positive number");	
		}
                for(int i = 0; i < theWord.length(); i++)
                { 
                        if (theWord.charAt(i) == 'A' || theWord.charAt(i) == 'E' || theWord.charAt(i) == 'F' || theWord.charAt(i) == 'H' || 
                        theWord.charAt(i) == 'I' || theWord.charAt(i) == 'L' || theWord.charAt(i) == 'M' || theWord.charAt(i) == 'N' || 
                        theWord.charAt(i) == 'O' || theWord.charAt(i) == 'R' || theWord.charAt(i) == 'S' || theWord.charAt(i) == 'X') {
                                System.out.print("Give me an " +theWord.charAt(i));
                                System.out.print(": " +theWord.charAt(i) +"!");
                                System.out.println();
                        }
                        else{
                                System.out.print("Give me a  " +theWord.charAt(i));
                                System.out.print(": " +theWord.charAt(i) +"!");
                        System.out.println();
                        }       
                }
                System.out.println("What does that spell?");
                while (numberOfRounds > 0) {
                        System.out.println(theWord +"!!!");
                        numberOfRounds --;
                }
        }
}
