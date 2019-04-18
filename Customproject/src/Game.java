public class Game {
	
	private double q;
	private double p;
	int trials;
	double totaloutcome;
	Player player1 = new Player(0.5);
	Player player2 = new Player(0.5);
	Matrix matrix;
	boolean losing = true;

	public Game (Matrix matrix) {
		this.matrix = matrix;
		
	
	}
	public void playgame() {
		double x = Math.random();
		double y = Math.random();
		 double p = this.player1.getpValue();
		 	System.out.println("p value = " + p);
		 double q = this.player2.getpValue();
		 	System.out.println("q value = " + q);
			if (x>p && y>q) {
				this.whowins(this.matrix.getD(), 2, 2);
			}else if (x>p && y<=q) {
				this.whowins(this.matrix.getC(), 2, 1);
			} else if (x<=p && y>q) {
				this.whowins(this.matrix.getB(), 1, 2);
			} else {
				this.whowins(this.matrix.getA(), 1, 1);
			}
			this.trials++;
	}
	void whowins(double value, int s1, int s2) {
		System.out.println("Outcome for player 1 = " + value); 
		System.out.println("Player 1 plays strategy: " + s1);
		System.out.println("Player 2 plays strategy: " + s2);
		
			this.player1.updatePvalue(value, s1);
			this.player2.updatePvalue(-value, s2);
	}
	
}

	
			