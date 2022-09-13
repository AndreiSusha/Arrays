import java.util.Arrays;
import java.util.Collections;

public class SchoolExample {

	public static void main(String[] args) {
		String name = "Andrei";
		String[] tvChannels = new String[5];
		
		tvChannels[0] = "Yle1";
		tvChannels[1] = "Yle2";
		tvChannels[2] = "Mtv3";
		tvChannels[3] = "4";
		tvChannels[4] = "TV5";
		
		Arrays.sort(tvChannels);
		Arrays.sort(tvChannels,Collections.reverseOrder());
		
		for (int i=0; i<tvChannels.length; i++ ) {
			
			System.out.println(tvChannels[i]);
			
		}
			
	}

}
