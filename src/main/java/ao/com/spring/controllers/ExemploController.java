package ao.com.spring.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@Valid @RequestBody EmpresaDTO empresaDTO, 
			BindingResult result) {
		
		final Response<EmpresaDTO> response = new Response<EmpresaDTO>();
		
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		empresaDTO.setId(1L);
		
		response.setData(empresaDTO);
		
		return ResponseEntity.ok(response);
	}
}
