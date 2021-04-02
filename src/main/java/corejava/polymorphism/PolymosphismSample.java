package corejava.polymorphism;

import java.util.ArrayList;
import java.util.List;

class Flower {
}
class Rose extends Flower {}
public class PolymosphismSample {
	public static void main(String[] args) {
		/*
		List<Parent> list = new ArrayList<Parent>();
		list.add(new Parent());
		list.add(new Child());
		
		for(Parent person:list)
		{
			person.test();
		}
		*/
		
		//Flower f = new Rose();
		Flower f = new Flower();
		if(f instanceof Rose ){
			Rose r=(Rose)f; //downcasting
			System.out.println("Downcasting is perfromed with instanceof operator");
			}
		
		Parent parent = new Parent();
		System.out.println(parent instanceof Child);
		if(parent instanceof Child)
		{
			Child child = (Child)parent;
			System.out.println("Child:"+child);
		}
		else 
		{
			System.out.println("No downcasting");
		}
		
	}

}
