package studio7;

public class Fraction {
	
	public int numerator;
	public int denom;
	
	public Fraction addition (Fraction f1) {
		if (f1.getDenom()== denom) {
			return new Fraction(this.numerator+f1.getNum(), this.denom);
		}
		
		else {
			int rDenom = this.denom * f1.getDenom();
			int fNum = this.numerator*f1.denom;
			int sNum = f1.getNum()*this.denom;
			return new Fraction(fNum+sNum, rDenom);
		}
		
	}
	
	public Fraction multiplication (Fraction f1) {
		return new Fraction(f1.getNum()*this.numerator, f1.getDenom()*this.denom);
		
	}
	
	public Fraction reciprocal() {
		return new Fraction (denom, numerator);
	}
	
	public int gcd(int p, int q) {
		
		// FIXME compute the gcd of p and q using recursion
		if (q == 0) {
			return p;
		}
		
		int temp = q;
		q = p%q;
		p = temp;
		
		
		
	
	
		return gcd(p,q);
	
	}
	
	public Fraction simplification () {
		
		int gcd = gcd(numerator, denom);
		return new Fraction(numerator/gcd, denom/gcd);
		
	}
	
	public int getNum () {
		return numerator;
	}
	
	public int getDenom() {
		return denom;
	}
	
	public Fraction(int numerator, int denom) {
		this.numerator = numerator;
		this.denom = denom;
	}
}
