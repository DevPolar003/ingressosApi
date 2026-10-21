package br.com.etechoracio.ingressos.controller;

import br.com.etechoracio.ingressos.entity.Sala;
import br.com.etechoracio.ingressos.entity.Sessao;
import br.com.etechoracio.ingressos.repositories.SessaoRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessao")
public class SessaoController
{

    @Autowired
    public SessaoRepository sessaoRepository;


    @GetMapping("/{id}")
    public ResponseEntity<Sessao> buscarPorId(@PathVariable Long id)
    {
        var sessao = sessaoRepository.findById(id);

        if(sessao.isPresent()) return ResponseEntity.ok(sessao.get());

        return ResponseEntity.notFound().build();
    }



    @GetMapping("/sess")
    public List<Sessao> listarSessoes()
    {
        return sessaoRepository.findAll();
    }



    @PostMapping("/post")
    public ResponseEntity<Sessao> postarSessao(@RequestBody Sessao se)
    {
       var sessao = sessaoRepository.save(se);
       return ResponseEntity.status(HttpStatus.CREATED).body(sessao);

    }

    @PutMapping("atu/{id}")
    public ResponseEntity<Sessao> atualizarSessao(@PathVariable Long id, @RequestBody Sessao sessao)
    {
        var sessaoId = sessaoRepository.findById(id);
                if(sessaoId.isPresent())
                {
                     sessaoRepository.save(sessao);
                     return ResponseEntity.status(HttpStatus.CREATED).body(sessao);
                }
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sessao);
    }
}
