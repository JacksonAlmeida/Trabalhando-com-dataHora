import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate dt = LocalDate.now();
        LocalDateTime dt1 = LocalDateTime.now();
        Instant st = Instant.now();

        LocalDate pp = LocalDate.parse("18/08/2023", df);
        LocalDateTime pt = LocalDateTime.parse("18/08/2023 18:01", df1);

        System.out.println("Data local: "+ dt);
        System.out.println("Data e hora local: "+ dt1);
        System.out.println("Data e hora UTC: "+ st);

        System.out.println("_________________________________________");
        System.out.println("Parse data: "+ pp);
        System.out.println("Parse data e hora: "+ pt);
    }
}