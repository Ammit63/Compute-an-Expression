public class E08_ComputeanExpression {

	public static void main(String[] args) {
		
		// create a double variable to calculate the expression.
		double exp1 = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		
		// create a string variable to show the expression we are calculating.
		String exp2 = "((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))";
		
		// %.3f rounds the result to 3 digits after the decimal point. 
		//The %n calls for a new line since we are using printf instead of println which automatically kicks it to a new line.
		
		System.out.printf(" When Calculated, this expression: " + exp2 + " will equal: " + exp1 + ". Or when rounded %n to 3 digits after the decimal point it will how up like this: %.3f %n", exp1);
	}

}
