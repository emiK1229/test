package person;

public class Test {

	public static void main(String[]args){
Person taro = new Person();
taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="090-XXX-XXXX";
taro.address="世田谷区下馬5丁目";

System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);
taro.talk();
taro.walk();

Person jiro = new Person();
jiro.name="木村次郎";
jiro.age=18;
jiro.phoneNumber="080-XXX-XXXX";
jiro.address="世田谷区下馬6丁目";

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.address);
jiro.talk();
jiro.walk();


Person hanako = new Person();
hanako.name="鈴木花子";
hanako.age=16;
hanako.phoneNumber="070-XXX-XXXX";
hanako.address="世田谷区下馬7丁目";

System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.address);
hanako.talk();
hanako.walk();


Robot aibo = new Robot();
aibo.name="aibo";

aibo.talk();
aibo.walk();
aibo.run();


Robot asimo = new Robot();
asimo.name="asimo";

asimo.talk();
asimo.walk();
asimo.run();


Robot pepper = new Robot();
pepper.name="pepper";

pepper.talk();
pepper.walk();
pepper.run();

	}
}
