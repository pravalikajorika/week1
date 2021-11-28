package week1.day1;

//type methodName ctrl+space
//type syso ctrl+space
//type main ctrl+space

//Access specifier Keyword Classname 
public class Car {
	
	//access specifier returnType method name() void doesn't return anything 
	public void applyBrake() {
		System.out.println("applied break"); //to print in console
	}
	
	public void soundHorn() {
		System.out.println("sound horn");
	}
	
	
	public static void main(String[] args) {
		//Classname objectname = new Classname()
		 Car myCar = new Car();
		 
		 //to call the method objectName.methodName()
		 myCar.applyBrake();
		 myCar.soundHorn();
		
	}

}
