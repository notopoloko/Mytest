public class Game{
	public static void main(String[] args){
		Deck_of_cards deck = new Deck_of_cards();
		deck.show_Deck();
		System.out.println();
		deck.shuffle();
		deck.show_Deck();
	}
}