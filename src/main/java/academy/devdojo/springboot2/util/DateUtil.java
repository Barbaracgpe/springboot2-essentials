package academy.devdojo.springboot2.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {
    public String formatLocalDateTimeDatabaseStyle(LocalDateTime LocalDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd- HH:mm:ss").format(LocalDateTime);
    }
}
