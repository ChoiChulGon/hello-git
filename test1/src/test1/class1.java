package test1;

import java.util.Calendar;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		System.out.println("���� ������");
		
		//Calendar cal = new Calendar(); �߻�޼���� ���� ��ü�� ������ �� ����.
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("���� (1 ~ 7, 1 : �Ͽ���) : " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("����, ���� (������ 0, ���Ĵ� 1)" + cal.get(Calendar.AM_PM));
		System.out.println("�ð� (0~11)" + cal.get(Calendar.HOUR));
		System.out.println("�ð� (0~23)" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� (0~59)"+ cal.get(Calendar.MINUTE));
		System.out.println(" �� (0~59)" + cal.get(Calendar.SECOND));
		System.out.println("1000���� 1�� :" + cal.get(Calendar.MILLISECOND));
		System.out.println("�� ���� ������ �� : "+cal.getActualMaximum(Calendar.DATE));
	}

}
