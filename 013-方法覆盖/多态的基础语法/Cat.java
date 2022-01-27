// 猫类，子类
public class Cat extends Animal{

	// 对move方法进行重写
	public void move(){
		System.out.println("cat走猫步！");
	}

	// 猫除了move之外，应该有自己特有的行为，例如抓老鼠。
	// 这个行为是子类型对象特有的方法。
	public void catchMouse(){
		System.out.println("猫正在抓老鼠！！！！");
	}

}