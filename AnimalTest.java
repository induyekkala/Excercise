package LambdaExpression;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ArrayList<Sighting> sightings=new ArrayList<Sighting>();
	AnimalMonitor animalMonitor=new AnimalMonitor();
	Sighting am=new Sighting("elephant",4,3,12,5);
	Sighting am1=new Sighting("Lion",3,3,12,5);
	Sighting am2=new Sighting("Tiger",7,3,12,5);
	
	sightings.add(am);
	sightings.add(am1);
	sightings.add(am2);
	animalMonitor.printlist_ForEach();
//	animal.printSightingsOf("elephant");
	
	
	
	   	
	
	
	
	

    }

}
