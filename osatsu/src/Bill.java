import java.time.YearMonth;

public class Bill {
    private int id;
    private String name;
    private YearMonth yearmonth;
    private boolean isImperial;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public YearMonth getDebut() {
        return yearmonth;
    }

    public boolean isImperial() {
        return isImperial;
    }

    public Bill(int id, String name, YearMonth yearmonth, boolean isImperial) {
        this.id = id;
        this.name = name;
        this.yearmonth = yearmonth;
        this.isImperial = isImperial;
    }

    public void bill() {
    }

    public String introduce() {
        return "私の名前は" + this.name + "です。登場年は" + this.yearmonth + "です。";
    }
}