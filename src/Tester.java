
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards myDeck = new DeckOfCards(52, true);
		myDeck = DeckOfCards.shuffle(myDeck);
		DeckOfCards myHand = DeckOfCards.deal1(myDeck, 5);
		DeckOfCards.deal2(myDeck, 5);
		for(int x = 0; x<myHand.deck.length;x++){
			if(myHand.deck[x].getRank()!=0){
				if(myHand.deck[x].getSuit() == 0){
					if(myHand.deck[x].getRank() == 1){
						System.out.println("Ace of Clubs");
					}
					else if(myHand.deck[x].getRank() == 11){
						System.out.println("Jack of Clubs");
					}
					else if(myHand.deck[x].getRank() == 12){
						System.out.println("Queen of Clubs");
					}
					else if(myHand.deck[x].getRank() == 13){
						System.out.println("King of Clubs");
					}
					else{
					System.out.println(myHand.deck[x].getRank() + " of Clubs");
					}
				}
				else if (myHand.deck[x].getSuit() == 1){
					if(myHand.deck[x].getRank() == 1){
						System.out.println("Ace of Diamonds");
					}
					else if(myHand.deck[x].getRank() == 11){
						System.out.println("Jack of Diamonds");
					}
					else if(myHand.deck[x].getRank() == 12){
						System.out.println("Queen of Diamonds");
					}
					else if(myHand.deck[x].getRank() == 13){
						System.out.println("King of Diamonds");
					}
					else{
					System.out.println(myHand.deck[x].getRank() + " of Diamonds");
					}
				}
				else if (myHand.deck[x].getSuit() == 2){
					if(myHand.deck[x].getRank() == 1){
						System.out.println("Ace of Hearts");
					}
					else if(myHand.deck[x].getRank() == 11){
						System.out.println("Jack of Hearts");
					}
					else if(myHand.deck[x].getRank() == 12){
						System.out.println("Queen of Hearts");
					}
					else if(myHand.deck[x].getRank() == 13){
						System.out.println("King of Hearts");
					}
					else{
					System.out.println(myHand.deck[x].getRank() + " of Hearts");
					}
				}
				else if (myHand.deck[x].getSuit() == 3){
					if(myHand.deck[x].getRank() == 1){
						System.out.println("Ace of Spades");
					}
					else if(myHand.deck[x].getRank() == 11){
						System.out.println("Jack of Spades");
					}
					else if(myHand.deck[x].getRank() == 12){
						System.out.println("Queen of Spades");
					}
					else if(myHand.deck[x].getRank() == 13){
						System.out.println("King of Spades");
					}
					else{
					System.out.println(myHand.deck[x].getRank() + " of Spades");
					}
				}
			}
		}
	}

}
