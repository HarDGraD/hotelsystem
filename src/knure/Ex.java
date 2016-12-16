package knure;


public class Ex {

	public static void main(String[] args) {
		Transport t[] = new Transport[9];
		t[0] = new Truck("Man", "��������", 50000.0, "black", 320, 10000, 8);
		t[1] = new Truck("Scania", "�����", 60000.0, "white", 540, 40000, 12);
		t[2] = new Truck("Daf", "��������", 30000.0, "white", 380, 5000, 6);
		t[3] = new Passenger("Audi", "����", 40000, "������", 250, 9);
		t[4] = new Passenger("BMW", "�����", 55000, "�����", 380, 7);
		t[5] = new Passenger("Chevrolet", "����", 30000, "�������", 250, 8);
		t[6] = new Ship("LBG", "������", 4000000, "������", 50000000);
		t[7] = new Ship("BING", "�������� ������", 5500000, "�����", 380000);
		t[8] = new Ship("DFRY", "����������� �����", 300000, "�������", 10000);
		
		System.out.println(t[0].getClass().toString());
		
		MyListImpl list = new MyListImpl();
		list.add(t[0]);
		list.add(t[1]);
		list.add(t[2]);
		list.add(t[3]);
		list.add(t[4]);
		
		list.addByIndex(t[8], 5);

		System.out.println(list);
		System.out.println(list.getSize());

	}

}
