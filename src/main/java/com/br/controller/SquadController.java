package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Squad;
import com.br.service.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SquadController {

    @Autowired
    private SquadService squadService;


    @PostMapping(Constant.API_SQUAD)
    public void save(@RequestBody Squad squad){
        squadService.save(squad);
    }

    @GetMapping(Constant.API_SQUAD)
    public List<Squad> findAll(){
        return squadService.findAll();
    }

    @PutMapping(Constant.API_SQUAD)
    public void update(@RequestBody Squad squad){
        squadService.save(squad);
    }

    @DeleteMapping(Constant.API_SQUAD + "/{id}")
    public void delete(@PathVariable("id") String id){
        squadService.delete(id);
    }

    @GetMapping(Constant.API_SQUAD + "/{id}")
    public Optional<Squad> findById(@PathVariable("id") String id){
        return squadService.findById(id);
    }

}
