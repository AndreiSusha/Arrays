
public class ThrownDiceNumbers {

	public static void main(String[] args) {
		int [] thrownDiceNumber = new int [5];
		int total = 0;
		int max = thrownDiceNumber[0];
		
		thrownDiceNumber[0]=2;
		thrownDiceNumber[1]=4;
		thrownDiceNumber[2]=1;
		thrownDiceNumber[3]=6;
		thrownDiceNumber[4]=5;
		
		for(int i=0; i<thrownDiceNumber.length; i++) {
			System.out.println(thrownDiceNumber[i]);
			total = total + thrownDiceNumber[i];
		}
		
		System.out.println();
		{
			System.out.println("Total sum is " + total);
		}
		for(int i=0; i<thrownDiceNumber.length; i++) {
			if (thrownDiceNumber[i]>max)
				max = thrownDiceNumber[i];
		}
		System.out.println("The highest value is " + max);
			
		
			
		}
	}
