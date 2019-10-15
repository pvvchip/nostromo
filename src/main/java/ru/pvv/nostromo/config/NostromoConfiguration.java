package ru.pvv.nostromo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.pvv.nostromo.entity.Rover;
import ru.pvv.nostromo.entity.repository.RoverRepository;

@Configuration
@Slf4j
public class NostromoConfiguration {

    @Bean
    public CommandLineRunner LoadService(RoverRepository roverRepository) {
        return args -> {
            log.info("Start load data");

            log.info("Data={}", roverRepository.save( new Rover("Rover_1", "888")));
            log.info("Data={}", roverRepository.save( new Rover("Rover_2", "888")));
            log.info("Data={}", roverRepository.save( new Rover("Rover_3", "808")));


            log.info("Load data end.");
        };
    }
}
