import java.time.YearMonth;

public class Bill {
    private int id;
    private String name;
    private YearMonth yearMonth;
    private boolean isImperial;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public YearMonth getDebut() {
        return yearMonth;
    }

    public boolean getIsImperial() {
        return isImperial;
    }

    public Bill(int id, String name, YearMonth yearmonth, boolean isImperial) {
        this.id = id;
        this.name = name;
        this.yearMonth = yearmonth;
        this.isImperial = isImperial;
    }


    public String introduce() {
        return "私の名前は" + this.name + "です。登場年は" + this.yearMonth + "です。";
    }
}