// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {

	    int numberOfruns = Integer.parseInt(args[0]);

		int biggerThenhalf = 0;

		int lessOrequalehalf = 0;

		for(int i = 0; i <= numberOfruns; i++) {

			double random = Math.random();

			if(random > 0.5) {

				biggerThenhalf++;

			} else {

				lessOrequalehalf++;
			}
		}

		double ratio = biggerThenhalf / lessOrequalehalf;

		if((biggerThenhalf == 0 || lessOrequalehalf == 0) || numberOfruns < 100 ) {

			System.out.println("> 0.5:  " + biggerThenhalf + " times");

		    System.out.println("<= 0.5: " + lessOrequalehalf+ " times");
		
		} else {

			System.out.println("> 0.5:  " + biggerThenhalf + " times");

		    System.out.println("<= 0.5: " + lessOrequalehalf+ " times");

			System.out.println("Ratio:  " + ratio);
		}

	}
}
