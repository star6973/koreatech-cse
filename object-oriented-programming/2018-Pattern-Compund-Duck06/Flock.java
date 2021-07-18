import java.util.ArrayList;

/**
 * 한국기술교육대학교 컴퓨터공학부 객체지향개발론및실습
 * Flock.java
 * 복합 패턴: Composite 패턴
 * 오리떼를 오리와 동일하게 취급할 수 있도록 해줌
 * 관찰자 패턴의 Subject 구현
 * registerObserver는 관리하고 있는 개별 오리에 각각 관찰자를 등록
 * notifyObservers는 구현하지 않음. 개별 오리에서 통보함
 * @author 김상진
 *
 */
public class Flock implements Quackable {
	private ArrayList<Quackable> quackers = new ArrayList<>();
	public void add(Quackable duck){
		quackers.add(duck);
	}
	@Override
	public void quack(){
		for(Quackable duck: quackers){
			duck.quack();
		}
	}
	@Override
	public void registerObserver(Observer observer) {
		for(Quackable duck: quackers)
			duck.registerObserver(observer);
	}
}
