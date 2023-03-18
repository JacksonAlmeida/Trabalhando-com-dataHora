import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        LocalDateTime dt1 = LocalDateTime.now();
        Instant st = Instant.now();

        SimpleDateFormat df = new SimpleDateFormat();

        LocalDate pp = LocalDate.parse("2023-03-18");

        System.out.println("Data local: "+ dt);
        System.out.println("Data e hora local: "+ dt1);
        System.out.println("Data e hora UTC: "+ st);

        System.out.println("_________________________________________");
        System.out.println("Parse data: "+ pp);
    }
}