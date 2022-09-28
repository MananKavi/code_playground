import java.io.*;
import java.text.*;
import java.util.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dateInString = day + "-" + month + "-" + year;
        try {
            Date date = sdf.parse(dateInString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            return dayOfTheWeek(dayOfWeek);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String dayOfTheWeek(int day) {
        switch (day) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
            default:
                return "";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int month = 5;
        int day = 4;
        int year = 2019;

        String res = Result.findDay(month, day, year);

        System.out.println(res);
    }
}
