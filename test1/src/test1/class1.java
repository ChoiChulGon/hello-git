package test1;

import java.util.Calendar;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		System.out.println("사용법 익히기");
		
		//Calendar cal = new Calendar(); 추상메서드라 직접 객체를 생성할 수 없다.
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일 (1 ~ 7, 1 : 일요일) : " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전, 오후 (오전은 0, 오후는 1)" + cal.get(Calendar.AM_PM));
		System.out.println("시간 (0~11)" + cal.get(Calendar.HOUR));
		System.out.println("시간 (0~23)" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 (0~59)"+ cal.get(Calendar.MINUTE));
		System.out.println(" 초 (0~59)" + cal.get(Calendar.SECOND));
		System.out.println("1000분의 1초 :" + cal.get(Calendar.MILLISECOND));
		System.out.println("이 달의 마지막 달 : "+cal.getActualMaximum(Calendar.DATE));
	}

}
