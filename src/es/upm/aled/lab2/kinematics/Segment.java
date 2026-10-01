package es.upm.aled.lab2.kinematics;

import java.util.List;

// TODO: Implemente la clase
public class Segment {
	public double length;
	public double angle;
	public List<Segment> children; 
	
	Segment(double length, double angle){
		this.length=length; 
		this.angle=angle; 
	}
	public double getLength() {
		return length;
	}
	public double getAngle() {
		return angle;
	}
	
	public List<Segment> getChildren(){
		return children;
	}
	
	public void setAngle(double angle) {
		this.angle=angle;
	}
	
	public void addChild (Segment child) {
		if (!children.contains(child)) {
			children.add(child);
		}
	}
	
	
}
