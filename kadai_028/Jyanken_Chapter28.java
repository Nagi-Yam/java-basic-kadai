package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMychoice() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		String input = scanner.next();
		
		return input;
	} 	
	
	public String getRandom() {
		
		String[] hands  = {"r","s","p"};
		
		int randomNum = (int)Math.floor(Math.random()*3);
		
		
	return hands[randomNum] ;
		
	}
	
	public void playGame() {
		
		String myHand = getMychoice();
		String youHand =getRandom();
		
		HashMap <String , String> handList = new HashMap<>();
		
		handList.put("r","グー");
		handList.put("s","チョキ");
		handList.put("p","パー");
		
		System.out.println("自分の手は"+handList.get(myHand)+"、対戦相手の手は"+handList.get(youHand));
		
		if(myHand.equals(youHand)) {
			
		System.out.println("あいこです");
		
		}else if ((myHand.equals("s")&& youHand.equals("p")) || (myHand.equals("r")&&youHand.equals("s"))||(myHand.equals("p")&&youHand.equals("r"))){
			System.out.println("あなたの勝ちです。");
		
		}else {
			System.out.println("あなたの負けです");
		}
		
	}

}
