package ru.pvv.nostromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.pvv.nostromo.entity.Rover;
import ru.pvv.nostromo.service.RoverService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class RoverController {

    private RoverService roverService;

    @Autowired
    public RoverController(RoverService roverService) {
        this.roverService = roverService;
    }

    @RequestMapping(value = "/rover/all", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Rover> getAllRovers() {
        return roverService.getAllRovers();
    }
}
