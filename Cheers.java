// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

           String Str = args[0];

           String newStr = Str.toUpperCase();

           int input = Integer.parseInt(args[1]);

           String letters = "AEFHILMNORSX";

           String cheer1 = "Give me ";

           String cheer2 = newStr + " ! ! !";

           String cheer3 = "What does thaat spell?";

           String linkWord = "";

           for(int i = 0; i < newStr.length(); i++){

                if(letters.indexOf(newStr.charAt(i)) != -1){

                        linkWord = "an ";

                } else {

                        linkWord = "a  ";                
                }

                System.out.println(cheer1 + linkWord + newStr.charAt(i) + ":  " + newStr.charAt(i) + "!");
           }

           System.out.println(cheer3);

           for(int t = 0; t < input; t++){

                   System.out.println(cheer2);
           }
        
        }
}
