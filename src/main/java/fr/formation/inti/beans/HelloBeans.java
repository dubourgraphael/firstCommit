package fr.formation.inti.beans;

public class HelloBeans {
	public HelloBeans() {
		System.out.println("création d'un HelloBean");
		
		
	}
	public static HelloBeans createInstance() {
		System.out.println("lalalala");
		return new HelloBeans();
	}
public void hello() {
	System.out.println("hello");
}
}
