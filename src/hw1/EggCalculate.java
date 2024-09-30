package hw1;

public class EggCalculate {
	
	//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	
	public static void main(String[] args) {
	
	int totalEggs = 200;
	int dozenEggs = 12;
	
	int dozens = totalEggs / dozenEggs;
	int remainingEggs = totalEggs % dozenEggs;
	
	System.out.println(totalEggs + "顆蛋共是" + dozens + "打 " + remainingEggs + "顆" );
	

    }

}