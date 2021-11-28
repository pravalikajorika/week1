package week1.day1;

public class Mobile {
	
	String mobileModel = "Oneplus 7";
	int mobileWeight = 50;
	boolean isFullCharge = false;
	double mobileCost = 4633615.966552463;
	
	//public void makeCall() {
		//System.out.println("to make the call");
	//}
	
	//public void sendMsg() {
		//System.out.println("to send a message");
	//}
	
	public static void main(String[] args) {
		 
		Mobile myMobile = new Mobile();
		
		//myMobile.makeCall();
		//myMobile.sendMsg();
			System.out.println(myMobile.mobileModel);
			System.out.println(myMobile.mobileWeight);
			System.out.println(myMobile.isFullCharge);
			System.out.println(myMobile.mobileCost);

	}

}
