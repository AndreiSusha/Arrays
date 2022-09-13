import java.util.Random;

public class Extra {

	public static void main(String[] args) {
		Random r = new Random();
		
		int [] n1 = new int [5];
		
		n1[0] = r.nextInt(20)+1;
		n1[1] = r.nextInt(20)+1;
		n1[2] = r.nextInt(20)+1;
		n1[3] = r.nextInt(20)+1;
		n1[4] = r.nextInt(20)+1;
		
		for (int i=0; i<n1.length; i++) {
			System.out.println(n1[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<n1[0]; i++) {
			System.out.print((i+1)+ " ");
		}
		System.out.println();
		
		for (int i=0; i<n1[1]; i++) {
			System.out.print((i+1)+ " ");
		}
		System.out.println();
		
		for (int i=0; i<n1[2]; i++) {
			System.out.print((i+1)+ " ");
		}
		System.out.println();
		
		for (int i=0; i<n1[3]; i++) {
			System.out.print((i+1)+ " ");
		}
		System.out.println();
		
		for (int i=0; i<n1[4]; i++) {
			System.out.print((i+1)+ " ");
		}
			
		
	}

}
