public class Main04 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します。");
// 		引数を用いて、メソッドの呼び出し
		hello("奏");
		hello("朝霞");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました。");
	}

	public static void hello(String name){
	    System.out.println(name + "さん、こんにちは！");
	}
}