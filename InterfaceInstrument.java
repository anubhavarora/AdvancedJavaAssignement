
public class InterfaceInstrument 
{

	public static void main(String[] args) 
	{
		Cutter c = new Cutter();
		Needle n = new Needle();
		ECGMachine e = new ECGMachine();
		Glucometer g = new Glucometer();
		
		c.cut();
		c.operate();
		c.sterilise();
		c.use();
		
		n.operate();
		n.poke();
		n.sterilise();
		n.use();
		
		e.operate();
		e.read();
		e.readHeartBeat();
		e.use();
		
		g.operate();
		g.read();
		g.readSugar();
		g.use();
	}

}

interface MedInstrument
{
	void use();
}

abstract class MedicalInstrument implements MedInstrument 
{
	abstract void operate();
}

abstract class SurgicalMedicalInstrument extends MedicalInstrument
{
	abstract void sterilise();
}

abstract class PathologicalMedicalInstrument extends MedicalInstrument
{
	abstract void read();
}

class Cutter extends SurgicalMedicalInstrument
{
	public void use() {System.out.println("Cutter is used");}
	void operate() {System.out.println("Cutter is operated");}
	void sterilise() {System.out.println("Cutter is steralised");}
	
	void cut() {System.out.println("cutter is used to cut");}
	
}

class Needle extends SurgicalMedicalInstrument
{
	public void use() {System.out.println("Needle is used");}
	void operate() {System.out.println("Needle is used to operate");}
	void sterilise() {System.out.println("Needle is steralised");}
	
	void poke() {System.out.println("Needle is poked");}
}



class Glucometer extends PathologicalMedicalInstrument
{
	public void use() {System.out.println("Glucometer is used");}
	void operate() {System.out.println("Glucometer is used to operated");}
	void read() {System.out.println("Glucometer is used for reading");}
	
	void readSugar() {System.out.println("Glucometer is used for reading sugar");}
}

class ECGMachine extends PathologicalMedicalInstrument
{
	public void use() {System.out.println("ECG is used");}
	void operate() {System.out.println("ECG is being operated");}
	void read() {System.out.println("ECG is being read");}
	
	void readHeartBeat() {System.out.println("ECG is being used to read heartbeat");}
}