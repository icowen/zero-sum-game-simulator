class Matrix
	{
		double p;
		double q; 
		double a;
		double b;
		double c;
		double d;
		
		
		public Matrix(double a, double b, double c, double d) 
		{
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.calculateOptimalStrategies();
			System.out.println("" + this.p + this.q);
		}
		
		
		
		
		void calculateOptimalStrategies()
		{
			double p = (this.d - this.c)/(this.a-this.c-this.b+this.d);
			this.p = p;
			double q = (this.d - this.b)/(this.a-this.b-this.c+this.d);
			this.q = q;	
			System.out.println("The probability of player 1 playing strategy A is: " + p);
			System.out.println("The probability of player 2 playing strategy A is: " + q);
		}
		
		
//		public double calculateexpectedValues()
//		
//		{
//			double expectedValue = (this.a*this.p*this.q) + (this.b*(1-this.p)*this.q) + (this.c*(1-this.q)*this.p) + (this.d*(1-this.q)*(1-this.p));
//			System.out.println("expectedValue" + expectedValue);
//
//				return expectedValue;
//		}
		
		
		double getA() {
			return this.a;
		}
		double getB() {
			return this.b;
		}
		double getC() {
			return this.c;
		}
		double getD() {
			return this.d;
		}
	
	}
	

		
