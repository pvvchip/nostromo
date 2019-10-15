package ru.pvv.nostromo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pvv.nostromo.entity.Rover;

public interface RoverRepository extends JpaRepository<Rover, Long> {
}
