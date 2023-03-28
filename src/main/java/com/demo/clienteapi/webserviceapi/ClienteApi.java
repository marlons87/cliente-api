package com.demo.clienteapi.webserviceapi;

import com.demo.clienteapi.Dto.ClienteDto;
import com.demo.clienteapi.Services.ClienteService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/cliente")
@Slf4j
public class ClienteApi {
    @Autowired

    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ClienteDto buscarCliente(@PathVariable int id){
        log.info("Busqueda de Cliente; {}", id);
        return clienteService.obtenerClienteReport(id);
    }

    @PostMapping
    public void guardarCliente(@Valid @RequestBody ClienteDto clienteDto){
        log.info("Se inserta el cliente; {}", clienteDto);
        clienteService.insertarCliente(clienteDto);
    }

    @PutMapping
    public void ActualizarCliente(@RequestBody ClienteDto clienteDto){
        log.info("Actualizar Cliente; {}", clienteDto);
        clienteService.actualizarCliente(clienteDto);
    }

   /* @PutMapping
    public void desactivarCliente(@RequestBody int clienteId){
        log.info("Desactivar Cliente; {}", clienteId);
        clienteService.actualizarCliente(clienteId);
    }*/
}
