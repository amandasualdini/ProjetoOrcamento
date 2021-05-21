package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Ambiente;
import com.br.model.Modulo;
import com.br.model.Squad;
import com.br.service.AmbienteService;
import com.br.service.ModuloService;
import com.br.service.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @Autowired
    private SquadService squadService;

    @Autowired
    private AmbienteService ambienteService;

    @PostMapping(Constant.API_MODULO)
    public void save(@RequestBody Modulo modulo){
        Optional<Squad> squad = squadService.findById(modulo.getSquad().get_id());
        Optional<Ambiente> ambiente = ambienteService.findById(modulo.getAmbiente().get_id());
        modulo.setSquad(modulo.getSquad());
        modulo.setAmbiente(modulo.getAmbiente());
        moduloService.save(modulo);
    }

    @GetMapping(Constant.API_MODULO)
    public List<Modulo> findAll(){
        return moduloService.findAll();
    }

    @PutMapping(Constant.API_MODULO)
    public void update (@RequestBody Modulo modulo){
        Optional<Squad> squad = squadService.findById(modulo.getSquad().get_id());
        Optional<Ambiente> ambiente = ambienteService.findById(modulo.getAmbiente().get_id());
        modulo.setSquad(modulo.getSquad());
        modulo.setAmbiente(modulo.getAmbiente());
        moduloService.save(modulo);
    }

    @DeleteMapping(Constant.API_MODULO + "/{id}")
    public void delete(@PathVariable("id") String id){
        moduloService.delete(id);
    }

    @GetMapping(Constant.API_MODULO + "/{id}")
    public Optional<Modulo> findById(@PathVariable("id") String id){
        return moduloService.findById(id);
    }
}
