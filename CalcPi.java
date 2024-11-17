// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int input = Integer.parseInt(args[0]);

		double sum = 0;

		for(int i = 0; i < input; i++) {

			double rationalNumberor = (double)1 / ((2 * i) + 1);

				if(i % 2 == 0) {

					sum += rationalNumberor;

				} else {

					sum -= rationalNumberor;
				}
		}
	System.out.println("pi according to Java: " + (4 * sum));	

	System.out.println("pi, approximated: " + Math.PI);

	}
}
