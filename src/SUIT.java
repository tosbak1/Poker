import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum SUIT {
		S, H, D, C;
	
	public String getSuit(){
		return this.toString();
	}
	private static final List<SUIT> VALUES =
			Collections.unmodifiableList(Arrays.asList(values()));
			private static final int SIZE = VALUES.size();
			private static final Random RANDOM = new Random();

			public static SUIT randomSuit()  {
			return VALUES.get(RANDOM.nextInt(SIZE));
			

	}
	};

