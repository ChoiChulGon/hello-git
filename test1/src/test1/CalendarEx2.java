package test1;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2019, 2, 13);
		System.out.println("date1 은 "+toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]
				+"요일이다");
		System.out.println("date2 은 "+toString(date2)+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]
				+"요일이다");
	
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년" + cal.get(Calendar.MONTH) + "월 " + cal.get(Calendar.DATE)
	+"일이고 ";
	}

}
