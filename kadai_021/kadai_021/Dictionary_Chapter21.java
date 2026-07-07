package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
		
		HashMap<String,String> dictionary= new HashMap<>();
		
		public Dictionary_Chapter21() {
			dictionary.put("apple","りんご");
			dictionary.put("peach","桃");
			dictionary.put("banana","バナナ");
			dictionary.put("lemon","レモン");
			dictionary.put("pear","梨");
			dictionary.put("kiwi","キウイ");
			dictionary.put("strawberry","いちご");
			dictionary.put("grape","ぶどう");
			dictionary.put("muscat","マスカット");
			dictionary.put("pear","梨");
			dictionary.put("cherry","さくらんぼ");
		
		}
		
		public void search (String word) {
			String meaning = dictionary.get(word);
			
			if(meaning != null) {
				System.out.println(word+"の意味は"+meaning);
				
			}	else {
				System.out.println(word+"は辞書に存在しません");
			}
		}
	}
	

