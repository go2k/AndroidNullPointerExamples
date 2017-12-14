import java.util.Date;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        String str = null;
//        str = str.substring(1, 2);
        double periode = getPeriode(new Date(), null);
        System.out.println(periode);
    }

    public static double getPeriode(Date start, Date end) {
//        if (start == null){
//            throw new NullPointerException("start must be not null");
//        }
//        if (end == null){
//            throw new NullPointerException("end must be not null");
//        }
        Objects.requireNonNull(start, "Parameter start must be no null");
        Objects.requireNonNull(end, "Parameter end must be not null");
        return end.getTime() - start.getTime();
    }
}
