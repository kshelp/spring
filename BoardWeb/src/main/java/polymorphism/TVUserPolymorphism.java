package polymorphism;

public class TVUserPolymorphism {
	public static void main(String[] args) {

		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		TV tv1 = new LgTV();
		tv1.powerOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.powerOff();

	}
}
