package test1;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[] DAY_OF_WEEK = { "", "��", "��", "ȭ", "��", "��", "��", "��" };

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2019, 2, 13);
		System.out.println("date1 �� "+toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]
				+"�����̴�");
		System.out.println("date2 �� "+toString(date2)+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]
				+"�����̴�");
	
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "��" + cal.get(Calendar.MONTH) + "�� " + cal.get(Calendar.DATE)
	+"���̰� ";
	}

}
