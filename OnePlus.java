
public class OnePlus {

	public static void main(String[] args) 
	{
		System.out.println("Inside OnePlus");
		OnePlusWatch hp = new OnePlusWatch();
		Battery b = new Battery();
		hp.showTime(10, 20, 30, b);
		hp.d.showDial("Oval");
		hp.s.showFabric("Leather");
	}

}

class Machine1{}
class Watch extends Machine1
{	
	
}
class Fabric{}
class Strap extends Fabric
{
	void showFabric(String fab)
	{
		System.out.println("Watch is made from "+fab);
	}
}

class Shape{}
class Dial extends Shape
{
	void showDial(String dialS)
	{
		System.out.println("Dial is of "+dialS+" shape.");
	}
}

class Battery{}

class OnePlusWatch extends Watch
{
	Dial d = new Dial();
	Strap s = new Strap();
	
	
	void showTime(int hh,int mm, int ss, Battery b)
	{
		Time t = new Time();
		t.setHours(hh);
		t.setMin(mm);
		t.setSec(ss);
		t.printTime();
	}
}

class Time
{
	private int hours, min, sec;
	
	
	
	public int getHours() {
		return hours;
	}



	public void setHours(int hours) {
		this.hours = hours;
	}



	public int getMin() {
		return min;
	}



	public void setMin(int min) {
		this.min = min;
	}



	public int getSec() {
		return sec;
	}



	public void setSec(int sec) {
		this.sec = sec;
	}



	void printTime()
	{
		System.out.println("Time in hh:mm:ss is : "+hours+":"+min+":"+sec );
	}
}