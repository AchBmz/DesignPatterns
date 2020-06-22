package design.strategy;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String country;
	
	public CreditCardStrategy(String nm, String ccNum, String country){
		this.name=nm;
		this.cardNumber=ccNum;
		this.country=country;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with credit card");
	}

}
