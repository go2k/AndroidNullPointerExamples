import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Periode {

    private Date start;
    private Date end;

    public Periode(Date start, Date end) {
        this.setStart(start);
        this.setEnd(end);
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = Objects.requireNonNull(start, "start must be not null");
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = Objects.requireNonNull(end, "end must be not null");
    }

    public void tueWas(){

    }


}
