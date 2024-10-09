package date;

import java.util.Date;
import java.text.*;

public class DateDemo2 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		//to formate the date 
		SimpleDateFormat sdf=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");
           //class       obj
		System.out.println("date is"+sdf.format(d));
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy 'year' ");
		SimpleDateFormat sdf2=new SimpleDateFormat("MM'month' ");
		SimpleDateFormat sdf3=new SimpleDateFormat("dd 'date' ");
		
		System.out.println("date is"+sdf1.format(d));
		System.out.println("date is"+sdf2.format(d));
		System.out.println("date is"+sdf3.format(d));
	}

}
