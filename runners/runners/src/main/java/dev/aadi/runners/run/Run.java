package dev.aadi.runners.run;

//import javax.xml.stream.Location;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(int id,
                  @NotEmpty
                  String title,
                  LocalDateTime startTime,
                  LocalDateTime endTime,
                  @Positive
                  double miles,
                  Location location)
{

    /*public Run{
        if(startTime().isAfter(endTime())){
            try {
                throw new IllegalAccessException("Endtime can't be before starttime");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }*/

}
