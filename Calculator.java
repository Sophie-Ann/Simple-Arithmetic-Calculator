
public class Calculator {
	public Calculator() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalculator = new Calculator();
		//Input values below
		System.out.println(myCalculator.add(0, 0));
		System.out.println(myCalculator.subtract(0, 0));
		System.out.println(myCalculator.multiply(0, 0));
		System.out.println(myCalculator.divide(0, 0));
	}
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) {
		if (b==0) {
			// Cannot divide by 0
			System.out.println("SYNTAX ERROR");
			return 0;
		}
		else {
			
		return a / b; 
		
		}
	}
}
