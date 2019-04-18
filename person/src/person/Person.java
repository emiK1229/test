//演習①

package person;

//初期値として、それぞれnullと0をいれる。このことを初期化という。
//この中にtestクラスからのnameとageを持っていく
public class Person {
	public String name=null;
	public int age = 0;

	public String phoneNumber=null;
	public String address=null;

	public void talk(){
		System.out.println(this.name+"が話す");
	}
	public void walk(){
		System.out.println(this.name+"が歩く");
	}
	public void run(){
		System.out.println(this.name+"が走る");
	}
}
