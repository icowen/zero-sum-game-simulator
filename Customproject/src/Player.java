public class Player {
	
	double pValue;
	public Player(double p) 
	{ 
		this.pValue = p;
	}
	double getpValue()
	{
		return this.pValue;
	}
	
	void updatePvalue(double value, int s) {
		double p = this.getpValue();
		if (s == 1) {
			this.pValue = p + 0.01*value*p*(1-p)*(1-p);
		} else if (s == 2) {
			this.pValue = p - 0.01*value*p*(p)*(1-p);
		}
	
	}
	 
	

}
