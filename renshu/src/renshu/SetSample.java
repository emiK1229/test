package renshu;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args){
	Set<String> set=new HashSet<String>();


	//値のセットは addメソッドを利用
	set.add("value1");
	set.add("value2");
	set.add("value3");
	set.add("value4");
	set.add("value5");


	set.add("value2");//重複要素を add


	//拡張For　文を利用
	for(String s:set){
		System.out.println(s);
	}
  }

}

//HashSet:重複なし:登録順は意識されずに記憶される
//TreeSet:重複なし:登録したキーが昇順で記憶される
//LinkedHashSet:登録した順番で記憶される
//→Set<[要素の型]>変数名=new HashSet<[要素の型]>();

//Setを使った場合には、add()で要素を記憶できます
//Setを使った場合には、拡張For文で要素を取得できます。