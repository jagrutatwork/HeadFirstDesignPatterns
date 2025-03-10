package strategyPattern;

public abstract class Duck {
	FlyBehaviour flybehaviour;
	QuackBehaviour quackbehaviour;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flybehaviour.fly();
		
	}
	
	public void performQuack() {
		quackbehaviour.quack();
		
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlybehaviour(FlyBehaviour flybehaviour) {
		this.flybehaviour = flybehaviour;
	}

	public void setQuackbehaviour(QuackBehaviour quackbehaviour) {
		this.quackbehaviour = quackbehaviour;
	}
	
	

}
