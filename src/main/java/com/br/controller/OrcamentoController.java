package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Modulo;
import com.br.model.Orcamento;
import com.br.service.ModuloService;
import com.br.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @Autowired
    private ModuloService moduloService;

    @PostMapping(Constant.API_ORCAMENTO)
    public void save(@RequestBody Orcamento orcamento){
        Optional<Modulo> modulo = moduloService.findById(orcamento.getModulo().get_id());
        orcamento.setModulo(modulo.get());
        orcamentoService.save(orcamento);
    }

    @GetMapping(Constant.API_ORCAMENTO)
    public List<Orcamento> findAll(){
        return orcamentoService.findAll();
    }

    @PutMapping(Constant.API_ORCAMENTO)
    public void update (@RequestBody Orcamento orcamento){
        Optional<Modulo> modulo = moduloService.findById(orcamento.getModulo().get_id());
        orcamento.setModulo(modulo.get());
        orcamentoService.save(orcamento);
    }

    @DeleteMapping(Constant.API_ORCAMENTO + "/{id}")
    public void delete(@PathVariable("id") String id){
        orcamentoService.delete(id);
    }

    @GetMapping(Constant.API_ORCAMENTO + "/{id}")
    public Optional<Orcamento> findById(@PathVariable("id") String id){
        return orcamentoService.findById(id);
    }
}
