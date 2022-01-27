
/*
	这个代码的疑问？
		肉眼可以观察到底层到底是new Bird()还是new Cat()！！
		我们为什么还要进行instanceof的判断呢！！！！

		原因是：
			你以后可能肉眼看不到。
*/
public class Test02{
	public static void main(String[] args){
		Animal x = new Bird();
		Animal y = new Cat();

		if(x instanceof Bird){
			Bird b = (Bird)x;
			b.sing();
		} else if(x instanceof Cat){
			Cat c = (Cat)x;
			c.catchMouse();
		}


		if(y instanceof Bird){
			Bird b = (Bird)y;
			b.sing();
		} else if(y instanceof Cat){
			Cat c = (Cat)y;
			c.catchMouse();
		}
	}
}