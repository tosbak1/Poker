
public class Poker {

	public static void main(String[] args){
		//RANK r=RANK.J;
		//Card c = new Card(r, SUIT.H);
		//Card d = new Card();
		Hand h = new Hand();
		
		//System.out.println("Rank and suit of this card is: " + d.getCard());
		//h.setHand();
		System.out.println("Your hand is " + h.getHand());
		System.out.println();
		System.out.println("Is this a high card?: " + h.isHighCard());
		System.out.println("Is this a pair?: " + h.isPair());
		System.out.println("Is this 3 of a kind?: " + h.is3ofAKind());
		System.out.println("Is this a Straight?: " + h.isStraight());
		System.out.println("Is this a Flush?: " + h.isFlush());
		System.out.println("Is this 4 of a kind?: " + h.is4ofAKind());
		System.out.println("Is this a straight flush?: " + h.isStraightFlush());
	}
}
