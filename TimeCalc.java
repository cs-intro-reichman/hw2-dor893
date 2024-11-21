public class TimeCalc {
    public static void main(String[] args) {
        
        String hour = args[0];

        int minutesToadd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt("" + hour.charAt(0) + hour.charAt(1));

        int minutes = Integer.parseInt("" + hour.charAt(3) + hour.charAt(4));

        int totalMinutes = (hours * 60) + minutes + minutesToadd;

        int totalHours = totalMinutes / 60;

        int newHours = totalHours % 24 ;

        int newMinutes = totalMinutes - (totalHours * 60);

        String hourResult = "";

        String minuteResult = "";

        if(newHours < 10) {

            hourResult = "0" + newHours;

        } else {

            hourResult = Integer.toString(newHours);
        }

        if(newMinutes < 10) {

            minuteResult = "0" + newMinutes;

        } else {

            minuteResult = Integer.toString(newMinutes);
        }

    String timeResult = hourResult + ":" + minuteResult;

    System.out.println(timeResult);

    }
}
