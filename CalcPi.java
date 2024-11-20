// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int input = Integer.parseInt(args[0]);

		double sum = 0.0;

		for                                                                                                 ען(int k = 0; k < input; k++) {

			double denominator = (2.0 * k) + 1;

			double rationalNumber = 1.0 / denominator; 

				if(k % 2 == 0) {

					sum += rationalNumber;

				} else {

					sum -= rationalNumber;
				}
		}

		double piResult = (4.0 * sum);

	    System.out.println("pi according to Java: " + Math.PI);	

	    System.out.println("pi, approximated:	  " + piResult);

	}
}
