
public class CurrentConditionDisplay implements Observer {
	private float temperature;
	private float humidity;
	private float pressure;

	public void display() {
		System.out.printf("현재온도: %.2f%n", temperature);
		System.out.printf("현재습도: %.2f%n", humidity);
		System.out.printf("현재기압: %.2f%n", pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) { // 데이터의 값을 입력하고 출력
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
