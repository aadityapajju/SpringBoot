package dev.aadi.runners;

import dev.aadi.runners.run.Location;
import dev.aadi.runners.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.util.Calendar.HOUR;

@SpringBootApplication
public class RunnersApplication {
	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(RunnersApplication.class, args);


			//log.info("app started");






	}

}
