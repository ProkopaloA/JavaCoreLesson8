package ua.lviv.lgs;

import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println("0 ��� ��������� �� ����� ���� ������ 0");
		System.out.println("1 ��� ������� �� ����� � ����� � ����� ���� ������ 1");
		System.out.println("2 ��� ������� �� ����� �� ����� ���� ���� ������� ��� ������ 2");
		System.out.println("3 ��� ������� �� ����� �� ����� �� ����� ����� ������� ��� ������ 3");
		System.out.println("4 ��� ������� �� ����� �� ����� �� ����� ����� ������� ��� ������ 4");
		System.out.println("5 ��� ������� �� ����� �������� ���� ���� ������ 5");
		System.out.println("6 ��� ������� �� ����� ��������� ���� ���� ������ 6");
		System.out.println("7 ��� ������� �� ����� �� ����� �� ����� ����� ������� ��� ������ 7");
		System.out.println("8 ��� ������� �� ����� �� ����� �� ����� ������� ������� ��� ������ 8");
		System.out.println("9 ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ��� ������ 9");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Seasons[] masSeasons = Seasons.values();
		Month[] masMonth = Month.values();
		while (true) {
			menu();
			switch (sc.next()) {
			case "0": {
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = isMonthPresent(masMonth, month);
				if (!flag) {
					System.out.println("̳���� �� ����");
				}
				break;
			}
			case "1": {
				System.out.println("������ ���� ����");
				String season = sc.next();

				boolean flag = false;

				for (Month m : masMonth) {
					if (m.getSeasons().toString().equalsIgnoreCase(season)) {
						flag = true;
					}
				}
				if (flag) {
					for (Month m1 : masMonth) {
						if (m1.getSeasons().name().equalsIgnoreCase(season)) {
							System.out.println("� ����� � ����� ���� ����� : " + m1);
						}
					}
				}

				if (!flag) {
					System.out.println("���� ���� ���� ����");
				}
				break;
			}
			case "2": {
				System.out.println("������ ������� ��� � �����");
				sc = new Scanner(System.in);
				int NumberOfDays1 = sc.nextInt();
				if (NumberOfDays1 == 28) {
					System.out.println("���� ����� �� ���� ����������");
				}
				for (Month m : masMonth) {
					if (m.getNumberOfDays() == NumberOfDays1) {
						System.out.println("������ � ��� � ����� : " + m);
					}
				}
				if (NumberOfDays1 > 31) {
					System.out.println("̳���� � ����� �������� ��� �� ����");
				}
				if (NumberOfDays1 < 28) {
					System.out.println("̳���� � ����� �������� ��� �� ����");
				}
				break;
			}
			case "3": {
				System.out.println("������ ������� ��� � �����");
				int numberOfDays2 = sc.nextInt();

				boolean flag = false;

				for (Month m : masMonth) {
					if (m.getNumberOfDays() == numberOfDays2) {
						flag = true;
					}
				}

				if (flag) {

					for (Month m2 : masMonth) {
						if (m2.getNumberOfDays() < numberOfDays2) {
							System.out.println("� ����� ����� ����� ��� " + m2);
						}
					}
				}

				if (flag == false)
					System.out.println("����� ������ �� ����");

				break;
			}
			case "4": {
				System.out.println("������ ������� ��� � �����");
				int numberOfDays3 = sc.nextInt();
				boolean flag = false;
				for (Month m : masMonth) {
					if (m.getNumberOfDays() == numberOfDays3) {
						flag = true;
					}
				}

				if (flag) {

					for (Month m2 : masMonth) {
						if (m2.getNumberOfDays() > numberOfDays3) {

							System.out.println("� ����� ����� ����� ��� " + m2);
						}
					}
				}

				if (!flag) {
					System.out.println("����� ������ �� ����");
				}
				break;
			}
			case "5": {
				System.out.println("������ ���� ����");
				String season1 = sc.next().toUpperCase();
				boolean flag = false;
				for (Seasons s : masSeasons) {
					if (s.name().equalsIgnoreCase(season1)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons seasons2 = Seasons.valueOf(season1);
					int i = seasons2.ordinal();

					if (i == (masSeasons.length - 1)) {
						i = 0;
						System.out.println("�������� " + masSeasons[i]);
					} else {
						System.out.println("�������� " + masSeasons[i + 1]);
					}
				}
				if (!flag)
					System.out.println("������ ������� ���� ����");

				break;
			}
			case "6": {
				System.out.println("������ ���� ����");
				String season1 = sc.next().toUpperCase();
				boolean flag = false;
				for (Seasons s : masSeasons) {
					if (s.name().equalsIgnoreCase(season1)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons seasons2 = Seasons.valueOf(season1);
					int i = seasons2.ordinal();

					if (i == (masSeasons.length - 1)) {
						i = 0;
						System.out.println("����� ��� ���� " + masSeasons[i]);
					} else {
						System.out.println("����� ��� ���� " + masSeasons[i + 1]);
					}
				}
				if (!flag)
					System.out.println("������ ������� ���� ����");

				break;
			}
			case "7": {
				System.out.println("����� �� ����� ����� ������� ���");
				for (Month m : masMonth) {
					if (m.getNumberOfDays() % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}
			case "8": {
				System.out.println("����� �� ����� ������� ������� ��� ");

				for (Month m : masMonth) {
					if (m.getNumberOfDays() % 2 != 0) {
						System.out.println(m);
					}
				}

				break;
			}
			case "9": {
				System.out.println("������ ����� ");
				String month0 = sc.next().toUpperCase();

				boolean flag = isMonthPresent(masMonth, month0);

				if (flag) {
					Month m3 = Month.valueOf(month0);
					if (m3.numberOfDays % 2 == 0) {
						System.out
								.println("��� �����: " + m3 + " �� ����� ������� ��� " + m3.getNumberOfDays());
					} else {
						System.out.println(
								"��� �����: " + m3 + " �� �� ����� ������� ��� " + m3.getNumberOfDays());
					}
				}

				if (!flag)
					System.out.println("����� ������ �� ���� ");

				break;
			}
			}
		}
	}

	private static boolean isMonthPresent(Month[] masMonth, String month) {
		boolean flag = false;
		for (Month m : masMonth) {
			if (m.name().equalsIgnoreCase(month)) {
				System.out.println("̳���� ����");
				flag = true;
			}
		}
		return flag;
	}
}
