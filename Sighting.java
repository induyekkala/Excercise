package LambdaExpression;

public class Sighting {
    
    private  String animal;
    private  int spotter;
    private  int count;
    private  int area;
    private  int period;
    
    
    
    public Sighting() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Sighting(String animal,int spotter,int count,int area,int period) {
	
	this.animal=animal;
	this.spotter=spotter;
	this.count=count;
	this.area=area;
	this.period=period;
    }
    
    public String getDetails() {
	
	return animal+ "count="+count+"area="+area+"spotter="+spotter+"period="+period;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getSpotter() {
        return spotter;
    }

    public void setSpotter(int spotter) {
        this.spotter = spotter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    
   
	

}
