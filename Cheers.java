// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String theWord = args[0];
                int numberOfRounds = Integer.parseInt(args[1]);
                for(int i = 0; i < theWord.length(); i++)
                {

                        if (theWord.charAt(i) == 'A' || theWord.charAt(i) == 'E' || theWord.charAt(i) == 'F' || theWord.charAt(i) == 'H' || 
                        theWord.charAt(i) == 'I' || theWord.charAt(i) == 'L' || theWord.charAt(i) == 'M' || theWord.charAt(i) == 'N' || 
                        theWord.charAt(i) == 'O' || theWord.charAt(i) == 'R' || theWord.charAt(i) == 'S' || theWord.charAt(i) == 'X' ||
                        theWord.charAt(i) == 'a' || theWord.charAt(i) == 'e' || theWord.charAt(i) == 'f' || theWord.charAt(i) == 'h' || 
                        theWord.charAt(i) == 'i' || theWord.charAt(i) == 'l' || theWord.charAt(i) == 'm' || theWord.charAt(i) == 'n' || 
                        theWord.charAt(i) == 'o' || theWord.charAt(i) == 'r' || theWord.charAt(i) == 's' || theWord.charAt(i) == 'x') {
                                System.out.print("Give me an " +Character.toUpperCase(theWord.charAt(i)));
                                System.out.print(": " +Character.toUpperCase(theWord.charAt(i)) +"!");
                                System.out.println();
                        }
                        else{
                                System.out.print("Give me a  " +Character.toUpperCase(theWord.charAt(i)));
                                System.out.print(": " +Character.toUpperCase(theWord.charAt(i)) +"!");
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
