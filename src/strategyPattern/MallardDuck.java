package strategyPattern;

public class MallardDuck extends Duck {

	public MallardDuck() {	
		quackbehaviour = new Quack();
		flybehaviour = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("Sorry I have been bugging you all these years");
		
	}

	
}
