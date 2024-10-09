package date;
import java.util.*;
public class DateDemo4 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		System.out.println("================================");	
		
		TimeZone tz=TimeZone.getTimeZone("CST");
		Calendar cal= Calendar.getInstance(tz);
		
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int dow=cal.get(Calendar.DAY_OF_WEEK);
		int doy=cal.get(Calendar.DAY_OF_YEAR);
		int m=cal.get(Calendar.MONTH);
		int y=cal.get(Calendar.YEAR);
		int h=cal.get(Calendar.HOUR);
		int mi=cal.get(Calendar.MILLISECOND);
		int s=cal.get(Calendar.SECOND);
		
		System.out.println("day is"+day);
		System.out.println("dow is"+dow);
		System.out.println("doy is"+doy);
		System.out.println("year is"+y);
		System.out.println("hour is"+h);
		System.out.println("milisecind  is"+mi);
		
		System.out.println("================================");
		
		System.out.println(day+"/"+m+"/"+y+""+h+":"+mi+":"+s);
	}

}
