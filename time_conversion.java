package opps.projects;


import java.text.SimpleDateFormat;
import java.util.*;

public class firstproject1 {
    public static void main(String[] args)

    {
        String format = "dd-mm-yyyy hh:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        Date dt = new Date();
        String defaultTZ = TimeZone.getDefault().getID();
        System.out.println(defaultTZ);

        Calendar cal = new GregorianCalendar();
        cal.setTime(dt);
        System.out.println("Date:" + dateFormat.format(cal.getTime()));
        System.out.println("timezone : " + cal.getTimeZone().getID());
        System.out.println("timezone name: " + cal.getTimeZone().getDisplayName());
        System.out.println();
        System.out.println();

        TimeZone amTZone = TimeZone.getTimeZone("America/Mexico_City");
        SimpleDateFormat ameFormat = new SimpleDateFormat(format);
        ameFormat.setTimeZone(amTZone);
        System.out.println("after conversion time zone is :");
        cal.setTimeZone(amTZone);
        System.out.println("date: " + dateFormat.format(cal.getTime()));
        System.out.println("time zone : " + cal.getTimeZone().getID());
        System.out.println("time zone name" + cal.getTimeZone().getDisplayName());

    }

}
