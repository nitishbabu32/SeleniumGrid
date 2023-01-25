import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MM-yyyy HH:mm:ss");
		Date systemDate=new Date();
		String dateAndTime =dateFormat.format(systemDate);
		System.out.println(dateAndTime);
	}

}
