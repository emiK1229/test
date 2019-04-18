package renshu;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args){
	Map<String,String>map=new HashMap<String,String>();


	//値のセットは　putメソッドを利用
	map.put("key1", "value1");
	map.put("key2", "value2");
	map.put("key3", "value3");
	map.put("key4", "value4");
	map.put("key5", "value5");


	//値の取得
	String value = map.get("key1");//value1が取得できる
	System.out.println(value);

	String valueNull = map.get("key6");//存在しないkeyの場合は null
	System.out.println(valueNull);

	//mapに該当するkeyが存在するか否かチェックすることも可能
	if(map.containsKey("key1")){
		System.out.println("key1は存在します");
	}else{
		System.out.println("key1は存在しません");
	}

	//拡張for文を利用してすべての情報を取得する
	for(Map.Entry<String,String> e:map.entrySet()){
		System.out.println(e.getKey()+":"+e.getValue());}

	}
}

//Mapを使う場合には以下のいずれかを使ってインスタンス化する。
///HashMap：null可能:登録順は意識されずに記憶される
///TreeMap: null可能:登録したキーが昇順で記憶される
///LinkedHashMap：null可能:登録した順番で記憶される
///→Map<key,[要素の型]>変数名= new HashMap<key,[要素の型]>();