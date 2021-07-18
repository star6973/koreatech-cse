/**
 * 한국기술교육대학교 컴퓨터공학부 객체지향개발론및실습
 * GooseAdapter.java
 * 복합 패턴: 어댑터 패턴
 * 거위를 오리 예제에서 사용할 수 있도록 거위에 대한 오리 어댑터: 객체 어댑터
 * 관찰자 기능을 구현하지 않음 
 * @author 김상진
 *
 */
public class GooseAdapter implements Quackable {
	private Goose goose;
	public GooseAdapter(Goose goose){
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}
}
