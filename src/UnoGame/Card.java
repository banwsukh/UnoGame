package UnoGame;

public class Card {

    

        public enum Suit {RED, YELLOW, GREEN, BLUE};

        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

        private final Suit suit;

        private final Value value;

      

        

        public Card(Suit s, Value gVal)

        {

           suit =s;

           value= gVal;

        }

	public Value getValue() {

		return this.value;

	}



	

        

	public Suit getSuit() {

		return this.suit;

        }

}