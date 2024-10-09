package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.mm.dd ' at 'hh:mm:ss a");
		// class obj format
		System.out.println("Date: " + sdf.format(d));

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd'/'mm'/'yyyy");
	//	SimpleDateFormat sdf2 = new SimpleDateFormat("dd' 'B' 'yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh'h 'mm'm 'ss's 'SS'ms 'a'['z']'");

		System.out.println("Date is: " + sdf1.format(d));
		//System.out.println("Date: " + sdf2.format(d));
		System.out.println("Time is: " + sdf3.format(d));
		}

}
