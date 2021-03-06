package renshu;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args){
	List<String>list = new ArrayList<String>();

 //値の記憶は add メソッドを利用
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");

 //値の取得
for (int i=0;i<list.size(); i++){
   //値の取得は　get　メソッドを利用
	System.out.println(list.get(i));
}

 //拡張for 文を利用するともっと簡単
	for(String s : list){
		System.out.println(s);
	}
	}
}

//配列の場合、宣言時に必要な個数を指定する必要がありましたが、Listでは後から要素数を変更することができるのが特徴。
//Listを使ったインスタンス化方法：
//List<[要素の型>変数名　=new ArrayList<[要素の型]>();
//List<[要素の型>変数名　=new LinkedList<[要素の型]>();
//→この書き方を「ジェネリクス」という。