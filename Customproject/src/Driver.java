import java.util.Scanner;

class Driver {
	public static void main(String args[])
	{
		double a,b,c,d;
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Press space to enter the matrix or anything to use default: ");
		if (keyboard.nextLine().equals(" ")){
		System.out.print("Enter A: ");
			a = keyboard.nextInt();
		System.out.print("Enter B: ");
			b = keyboard.nextInt();
		System.out.print("Enter C: ");
			c = keyboard.nextInt();
		System.out.print("Enter D: ");
			d = keyboard.nextInt();
		} else {
			a = 3;
			b = 4;
			c = 6; 
			d = -10;
		}
			double outcomeP1 = Math.min(Math.max(a, c), Math.max(b,d));
			double outcomeP2 = Math.max(Math.min(a, b), Math.min(c,d));
		if (a - b - c + d == 0 || outcomeP1 == outcomeP2) {
			System.out.println("The optimal outcome is  " + outcomeP1);
			
			if (outcomeP1 == a) {
				System.out.println("p = 1.0, therefore, you should play strategy 1; and q = 1.0, therefore, you should play strategy 1!");
			} else if (outcomeP1 == b) {
				System.out.println("p = 1.0, therefore, you should play strategy 1; and q = 0.0, therefore, you should play strategy 2!");
			} else if (outcomeP1 == c) {
				System.out.println("p = 0.0, therefore, you should play strategy 2; and q = 1.0, therefore, you should play strategy 1!");
			} else {
				System.out.println("p = 0.0, therefore, you should play strategy 2; and q = 0.0, therefore, you should play strategy 2!");
			}
		} else {
			
			Matrix matrix = new Matrix(a,b,c,d);
			Game game = new Game(matrix);
			game.playgame();
			
			for (int i=0; i <20000	; i++) {
				System.out.println("*******");
				game.playgame();
			}
			System.out.println(game.trials);
		}
			

			
	
			
		}
}
