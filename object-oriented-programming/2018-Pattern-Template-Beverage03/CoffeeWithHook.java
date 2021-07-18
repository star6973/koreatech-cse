import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage{
	protected void brew(){
		System.out.println("커피를 내림");
	}
	protected void addCondiment(){
		System.out.println("밀크와 설탕 추가");
	}
	protected boolean customerWantsCondiments(){
		Scanner in = new Scanner(System.in);
		System.out.print("밀크와 설탕을 추가하시겠습니까 (y/n)? ");
		String answer = in.nextLine().toLowerCase();
		in.close();
		return answer.equals("y");
	}
}
