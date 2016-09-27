import java.util.ArrayList;
import java.util.Collections;

public class Hand {
    //private List<? extends Card> myCardList;
    //public Card n1, n2, n3, n4, n5;
	private ArrayList<Card> manyCards;
	private ArrayList<Integer> rankId;
	private ArrayList<String> suits;
    //Card n1 = new Card();
    //Card n2 = new Card();
    //Card n3 = new Card();
    //Card n4 = new Card();
    //Card n5 = new Card();
	//Card e = new Card();

	//public Hand(List<? extends Card> myCList){
	//	this.myCardList = myCList;
	//}
	
	public Hand(){
		manyCards = new ArrayList<Card>();
		rankId = new ArrayList<Integer>();
		suits = new ArrayList<String>();
		//this.setHand();
		//Hard coding new cards for testing purposes
		Card c = new Card(RANK.TEN,SUIT.D);
		Card c1 = new Card(RANK.TEN,SUIT.C);
		Card c2 = new Card(RANK.TEN,SUIT.D);
		Card c3 = new Card(RANK.TEN,SUIT.D);
		Card c4 = new Card(RANK.A,SUIT.D);
		//manually putting the created cards into the manyCards list
		manyCards.add(c);
		manyCards.add(c1);
		manyCards.add(c2);
		manyCards.add(c3);
		manyCards.add(c4);
		//Putting the different suits into the suits list 
		suits.add(c.getSuit());
		suits.add(c1.getSuit());
		suits.add(c2.getSuit());
		suits.add(c3.getSuit());
		suits.add(c4.getSuit());
		//Putting the ranks of the different cards into the rankId list
		rankId.add(c.getRank());
		rankId.add(c1.getRank());
		rankId.add(c2.getRank());
		rankId.add(c3.getRank());
		rankId.add(c4.getRank());
		

	}
	
	public void setHand(){

		for (int i = 0; i<5; i++){
			Card e = new Card();
			if(manyCards.contains(e)){
				--i;
			}
			else{
				manyCards.add(e);
				suits.add(e.getSuit());
				rankId.add(e.getRank());
			}
		}
	}
	public String getHand(){
		String str = "";
		for (Card d: manyCards){
			str+= d.getCard() + " ";
		}
		return str;
	}
	
	public boolean isStraight(){
			//if((manyCards.get(i).getRankValue() - manyCards.get(i+1).getRankValue()) != abs(1)){
			//	Straight
			//}
		/*for (int i = 0; i< 5; i++){
			rankId.add(manyCards.get(i).getRank());
		}*/
		
		Collections.sort(rankId);
		//System.out.println(rankId);
		/*
		if(rankId.get(0) - rankId.get(1) == Math.abs(1)){
			if(rankId.get(1) - rankId.get(2) == Math.abs(1)){
				if(rankId.get(2) - rankId.get(3) == Math.abs(1)){
					if(rankId.get(3) - rankId.get(4) == Math.abs(1)){
						return true;
					}
				}
			}
			
		}
		return false;
		*/
		for (int i = 0; i< 4; i++){
			if(rankId.get(i) + 1 != rankId.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public boolean isFlush(){
		int freq,freq1,freq2,freq3;
		
		freq = Collections.frequency(suits, "C");
		freq1 = Collections.frequency(suits, "D");
		freq2 = Collections.frequency(suits, "H");
		freq3 = Collections.frequency(suits, "S");
		
		return freq==5 || freq1==5|| freq2==5||freq3==5;
	}
	
	public boolean isStraightFlush(){
		return this.isFlush() && this.isStraight();
		 
	}
	
	public boolean isPair(){
		/*
		int count;
		boolean value;
		for(int i =0; i<5;i++){
			if(Collections.frequency(rankId, rankId.get(i)) ==2){
				value = false;
			}
			value = true;
		}
		return false;
		*/

		return this.kindTest(2);
	}
	
	public boolean is3ofAKind(){

		return this.kindTest(3);
	}
	
	public boolean is4ofAKind(){

		return this.kindTest(4);
	}
	private boolean kindTest(int value){
		if(Collections.frequency(rankId, rankId.get(0)) >= value || Collections.frequency(rankId, rankId.get(1)) >=value || Collections.frequency(rankId, rankId.get(2)) >=value || Collections.frequency(rankId, rankId.get(3)) >=value || Collections.frequency(rankId, rankId.get(4)) >=value){
			return true;
		}
		return false;
	}
	
	public boolean isHighCard(){
		return !(this.isPair() || this.is3ofAKind() || this.is4ofAKind() || this.isStraight() || this.isFlush() || this.isStraightFlush());
	}
	
	
}
