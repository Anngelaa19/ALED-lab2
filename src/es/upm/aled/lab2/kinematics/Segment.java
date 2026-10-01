package es.upm.aled.lab2.kinematics;

import java.util.List;

// TODO: Implemente la clase
public class Segment {
	public double length;
	public double angle;
	public List<Segment> children; 
	
	//Creamos el constructor de la clase Segment con los atributos length y angle
	Segment(double length, double angle){
		this.length=length; 
		this.angle=angle; 
	}
	//Creamos los getters de length, angle y children
	public double getLength() {
		return length;
	}
	public double getAngle() {
		return angle;
	}
	
	public List<Segment> getChildren(){
		return children;
	}
	//Creamos el setter de angle
	public void setAngle(double angle) {
		this.angle=angle;
	}
	/*Creamos el método para añadir personas a la lista de children, comprobando primero 
	 * si la persona que pasamos como atributo está incluida en la lista o no. Si no está, 
	 * se añade a la lista, mientras que si está, se deja tal cual está
	 * */
	 
	public void addChild (Segment child) {
		if (!children.contains(child)) {
			children.add(child);
		}
	}
	
	
}
