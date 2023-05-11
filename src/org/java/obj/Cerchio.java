package org.java.obj;

import org.java.obj.inter.Polygon;

public class Cerchio implements Polygon {

	private int raggio;
	
	public Cerchio(int raggio) {
		
		setRaggio(raggio);
	}
	
	public int getRaggio() {
		return raggio;
	}
	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}

	@Override
	public int getPerim() {
		
		return (int) (2 * getRaggio() * Math.PI);
	}

	@Override
	public int getArea() {

		return (int) (getRaggio() * getRaggio() * Math.PI);
	}

	@Override
	public String toString() {
		
		return "(C) " + getRaggio() 
			+ "\nperimetro: " + getPerim()
			+ "\narea: " + getArea();
	}
}
