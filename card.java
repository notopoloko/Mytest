public class card{
	String suit,card;
	public card(String suit, String card){
		this.suit = suit;
		this.card = card;
	}
	public String get_name(){
		return card + " of " + suit;
	}
}