package kadai_018;

public class KatoExec_Chapter18 {
	public static void main (String[]args){
	
KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        
        taro.setGivenName();
        taro.familyName = "加藤";
        taro.address = "東京都中野区〇×";
        taro.execIntroduce();
        
        System.out.println();
        
        
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.setGivenName();
        ichiro.familyName = "加藤";
        ichiro.address = "東京都中野区〇×";
        ichiro.execIntroduce();
        
        System.out.println();
        
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.setGivenName();
        hanako.familyName = "加藤";
        hanako.address = "東京都中野区〇×";
        hanako.execIntroduce();
	}
	
	
}
