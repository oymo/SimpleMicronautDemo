package com.example.web;

import com.example.data.DeveloperRepo;
import com.example.model.Developer;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller("/developer")
public class DeveloperController {
    private DeveloperRepo developerRepo;

    public DeveloperController(DeveloperRepo developerRepo) {
        this.developerRepo = developerRepo;
    }

    @Get("/random")
    public Developer getRandomDev(){
        List<Developer> allDevs = StreamSupport.stream(developerRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
        Collections.shuffle(allDevs);
        return (allDevs.isEmpty() ? null : allDevs.get(0));
    }
}
