package dev.aadi.runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }
    Optional<Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id() == id)
                .findFirst();
    }
    void create(Run run){
        runs.add(run);
    }
    void update(Run run, Integer id){
        Optional<Run> exist = findById(id);
        if(exist.isPresent()){
            runs.set(runs.indexOf(exist.get()),run);
        }
    }

    void delete(Integer id){
        runs.removeIf(run -> run.id() == id);
    }

    @PostConstruct
    private void init(){
        runs.add(new Run(2,"1st run",LocalDateTime.now(),
                LocalDateTime.now().plus(2, ChronoUnit.HOURS),
                3, Location.OUTDOOR));

        runs.add(new Run(3,"2nd run",LocalDateTime.now(),
                LocalDateTime.now().plus(1, ChronoUnit.HOURS),
                4, Location.OUTDOOR));
    }
}
