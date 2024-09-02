package dev.aadi.runners.run;

//import javax.xml.stream.Location;
import java.time.LocalDateTime;

public record Run(int id,
                  String title,
                  LocalDateTime startTime,
                  LocalDateTime endTime,
                  double miles,
                  Location location)
{}
