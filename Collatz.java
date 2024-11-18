// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int seed = Integer.parseInt(args[0]);

		String mood = args[1]; 

		int steps = 0;

		for (int i = 1; i <= seed; i++) {  

			steps = 0;

			int num = i;

			steps++;

			if(mood.equals("v")){

				System.out.print(num + " ");
			}

			if(i == 1) {

				   if(num % 2 == 0) {

				    num = num / 2;

			       } else {

				    num = (3 * num) + 1;
			       }

			   if(mood.equals("v")){

				System.out.print(num + " " );

	           }

			   steps++;

			   if(num == 1) {

				   break;

			   }

		    }

			while (num != 1) {

			    if(num % 2 == 0) {

				    num = num / 2;

			    } else {

				    num = (3 * num) + 1;
			    }

			if(mood.equals("v")){

				System.out.print(num + " " );

			}

			steps++;

		    }

		 if(mood.equals("v")){

			 System.out.println("(" + steps + ")");

		 }

		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

	}

	}
}
