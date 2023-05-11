package org.java.obj;

import org.java.obj.inter.Polygon;

public class Rettangolo implements Polygon {

	private int base;
	private int altezza;
	
	public Rettangolo(int base, int altezza) {
		
		setBase(base);
		setAltezza(altezza);
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public int getPerim() {
		
		return 2 * getBase() + 2 * getAltezza();
	}

	@Override
	public int getArea() {
		
		return getBase() * getAltezza();
	}
	
	@Override
	public String toString() {
		
		return "(R) " + getBase() 
			+ " x " + getAltezza() 
			+ "\nperimetro: " + getPerim()
			+ "\narea: " + getArea();
	}

}
