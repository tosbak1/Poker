import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum RANK {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), J(11), Q(12), K(13), A(14);
		
		private int count;
		private RANK(int count){
			this.count = count;
		}
		
		public String getRank(){
			if ( count >= 2 && count < 11){
				//return Integer.toString(count);
				return String.valueOf(count); 
			}
			
			return this.toString();
		}
		
		public int getRankValue(){
			return count;
		}
		
		private static final List<RANK> VALUES =
			Collections.unmodifiableList(Arrays.asList(values()));
			private static final int SIZE = VALUES.size();
			private static final Random RANDOM = new Random();

			public static RANK randomRank()  {
			return VALUES.get(RANDOM.nextInt(SIZE));
		}
		
	};

