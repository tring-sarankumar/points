package assignment.points;

public class PointLogic implements Cloneable{
	Float x;
	Float y;
	PointLogic(Float x,Float y){
		this.x=x;
		this.y=y;
	}
        boolean testEqual() {
		return x.equals(y);
	} 
<<<<<<< HEAD
	
	PointLogic point() {
		try {
			return (PointLogic) super.clone();
			
		}catch(CloneNotSupportedException e) {
			System.out.println("cloning");
			return this;
			
		}
		
=======
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
>>>>>>> 983894a15a85f6f7fddeef6e06fa8c91dbf3193e
	}

}
