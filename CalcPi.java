// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int input = Integer.parseInt(args[0]);

		double sum = 0.0;

		for(int k = 0; k < input; k++) {

			double denominator = (2 * k) + 1;

			double rationalNumberor = 1 / denominator; 

				if(k % 2 == 0) {

					sum += (double) rationalNumberor;

				} else {

					sum -= (double) rationalNumberor;
				}
		}

		double piResult = (4 * sum);

	    System.out.println("pi according to Java: " + piResult);	

	    System.out.println("pi, approximated: " + Math.PI);

	}
}
