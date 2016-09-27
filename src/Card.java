
public class Card{
	private RANK rn;
	private SUIT su;
	

	 
	
	public Card(RANK str, SUIT ch){
		this.rn = str;
		this.su = ch;
	}
	
	public Card(){
		this.rn = RANK.randomRank();
		this.su = SUIT.randomSuit();
	}
	
	
	public void setCard(RANK str, SUIT ch){
		this.rn = str;
		this.su = ch;
	}
	
	public int getRank(){
		return this.rn.getRankValue();
 	}
	
	public String getSuit(){
		return this.su.getSuit();
	}
	
	
	public String getCard(){
		return rn.getRank()+su;
	}
	@Override
	public boolean equals(Object card){
		boolean isSame = false;
		if(card != null && card instanceof Card){
			isSame = this.getCard().equals(((Card) card).getCard());
		}
		return isSame;
	}

}
