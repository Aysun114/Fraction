package fraction;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public void setNum(int n) {
		numerator=n;
	}
	public int getNum() {
		return numerator;
	}
	public void setDen(int d) {
		denominator=d;
	}
	public int getDen() {
		return denominator;
	}
	
	public Fraction() {
		 numerator=0;
		 denominator=1; 
	 }
	public Fraction(int n) {
		numerator=n;
		 denominator=1;

	}
	public  Fraction(int n,int d) {
		numerator=n;
		 denominator=d;
		
	}	
	
	public String toString() {
		if(numerator==0) {
			
			return "0";
		}else if(denominator==1) {
			
			return numerator+"";
		}
		return numerator + "/" + denominator;
		
    }
	}
	
	
		

		

	

	


