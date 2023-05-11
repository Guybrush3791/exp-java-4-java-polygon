package org.java;

import org.java.obj.Cerchio;
import org.java.obj.Rettangolo;
import org.java.obj.inter.Polygon;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo r = new Rettangolo(10, 20);
		System.out.println(r);
		
		System.out.println("\n---------------\n");
		
		Cerchio c = new Cerchio(5);
		System.out.println(c);
				
		System.out.println("\n---------------\n");
		
		int sumPer = 0;
		int sumArea = 0;
		Polygon[] polyArr = { r, c };
		for (int x=0;x<polyArr.length;x++) {
			
			Polygon p = polyArr[x];
			
			int per = p.getPerim();
			int area = p.getArea();
			
			sumPer += per;
			sumArea += area;
		}
		
		System.out.println("somma perimetro: " + sumPer);
		System.out.println("somma area: " + sumArea);
	}
}
