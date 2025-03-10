package decoratorPattern;

public class StarbuzzCoffee {
	
	public static void main(String [] Args)
	{
		System.out.println("Welcome to Starbuzz!");
		
		Beverage beverage =  new Espresso();
		System.out.println(beverage.getDescription() + ", $" + beverage.cost());
		
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); //wrapping beverage2 with Mocha
		beverage2 = new Mocha(beverage2); //wrapping beverage2 with Mocha
		beverage2 = new Whip(beverage2); //wrapping beverage2 with Whip
		System.out.println(beverage2.getDescription() + ", $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + ", $" + beverage3.cost());
		
	}

}
