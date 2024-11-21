// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

           String Str = args[0];

           String toUppercase = Str.toUpperCase();

           int input = Integer.parseInt(args[1]);

           String letters = "AEFHILMNORSX";

           String cheer1 = "Give me ";

           String cheer2 = toUppercase + "!!!";

           String cheer3 = "What does that spell?";

           String linkWord = "";

           for(int i = 0; i < toUppercase.length(); i++){

                if(letters.indexOf(toUppercase.charAt(i)) != -1){

                        linkWord = "an ";

                } else {

                        linkWord = "a  ";                
                }

                System.out.println(cheer1 + linkWord + toUppercase.charAt(i) + ": " + toUppercase.charAt(i) + "!");
           }

           System.out.println(cheer3);

           for(int t = 0; t < input; t++){

                   System.out.println(cheer2);
           }
        
        }
}


