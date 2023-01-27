package assignment.points;

public class PointLogic implements Cloneable{
	Float x;
	Float y;
	PointLogic(Float x,Float y){
		this.x=x;
		this.y=y;
	}
    boolean testEqual() 
    {
		return x.equals(y);
	} 
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
