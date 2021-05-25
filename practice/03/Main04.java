public class Main04 {
	public static void main(String[] args) {
		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更>");

// 		数字を受け付ける
		int selected = new java.util.Scanner(System.in).nextInt();

// 		条件に従って表示する
        switch(selected){

        case 1:
        System.out.println("検索します");
		break;

		case 2:
		System.out.println("登録します。");
		break;

		case 3:
		System.out.println("削除します。");
		break;

		case 4:
		System.out.println("変更します。");
		break;
        }
	}
}