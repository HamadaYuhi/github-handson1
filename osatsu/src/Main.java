import java.time.YearMonth;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        YearMonth yearMonth1 = YearMonth.of(2024, 7);
        YearMonth yearMonth2 = YearMonth.of(1984, 11);
        YearMonth yearMonth3 = YearMonth.of(1954, 10);

        Bill bill1 = new Bill(1, "渋沢栄一", yearMonth1, false);
        Bill bill2 = new Bill(2, "福沢諭吉", yearMonth2, false);
        Bill bill3 = new Bill(3, "聖徳太子", yearMonth3, true);


        List<Bill> billList = List.of(bill1, bill2, bill3);

        for (Bill bill : billList) {
            System.out.println("ID:" + bill.getId());
            System.out.println("名前:" + bill.getName());
            System.out.println("登場年:" + bill.getDebut());
            System.out.println("皇族 T/F:" + bill.getIsImperial());

            if (bill.getIsImperial())
                System.out.println("皇族は" + bill.getIsImperial());

        }
        System.out.println(bill1.introduce());
    }
}