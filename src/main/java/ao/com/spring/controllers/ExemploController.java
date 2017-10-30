package ao.com.spring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ao.com.spring.controllers.util.Response;
import ao.com.spring.dto.EmpresaDTO;

@RestController
@RequestMapping(value = "api/exemplo")
public class ExemploController {

	@GetMapping(value="/{nome}")
	public String teste(@PathVariable(name="nome") String nome) {
		return "Teste: " + nome;
	}
	
	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@RequestBody EmpresaDTO empresaDTO) {
		empresaDTO.setId(1L);
		Response<EmpresaDTO> response = new Response<>(empresaDTO);
		return ResponseEntity.ok(response);
	}
}
