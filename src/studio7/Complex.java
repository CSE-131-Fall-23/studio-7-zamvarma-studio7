package studio7;

public class Complex {
	
	public Double a;
	public Double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Complex addition(Complex c1) {
		return new Complex(this.a+c1.a, this.b+c1.b);
	}
	
	public Complex multiplication(Complex c1) {
		
		double n1 = this.a*c1.a;
		double n2 = this.a*c1.b;
		double n3 = this.b*c1.a;
		double n4 = -1.0*(this.b*c1.b);
		
		double cons1 = n1+n4;
		double cons2 = n2+n3;
		
		return new Complex(cons1, cons2);
		
	}
	
	
}
