
public class Tea {
	public void prepareRecipe(){
		boilWater(); // 동일 부분
		steepTeaBag();
		pourInCup(); // 동일 부분
		addLemon();
	}
	private void boilWater(){
		System.out.println("물을 끓임");
	}
	private void steepTeaBag(){
		System.out.println("티백을 담그다");
	}
	private void pourInCup(){
		System.out.println("컵에 따르다");
	}
	private void addLemon(){
		System.out.println("레몬 추가");
	}
}
