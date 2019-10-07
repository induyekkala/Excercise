package LambdaExpression;
import java.util.*;

import com.sun.jdi.Value;

public class AnimalMonitor {
    
    private ArrayList<Sighting> sightings;
    private Sighting sighting;
    public AnimalMonitor() {
	
	this.sightings=new ArrayList<>();
	
    }
    
    public void addSightings(String filename)
    {
	SightingReader reader=new SightingReader();
//	sightings.addAll(reader));
    }
    
    public void printlist() {
	for(Sighting record:sightings) {
	    System.out.println(record.getDetails());
	}
    }
    
    
    public void printlist_ForEach() {
    sightings.forEach(record->
                      System.out.println(record.getDetails()));
    }
    
//    public void printSightingsOf(String animal)
//    {
//	sightings.stream()
//	.filter(sighting->animal.equals(sighting.getAnimal()))
//	.forEach(value->System.out.println(value.getDetails()));
//    }
    
	
//	public void printSighting(Sighting record) {
//	    
//	    System.out.println(record.getDetails());
//	}
	
	
	
	
    }
    


