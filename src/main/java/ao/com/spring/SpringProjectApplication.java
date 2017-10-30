package ao.com.spring;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ao.com.spring.dao.interfaces.EmpresaRepository;
import ao.com.spring.entities.Empresa;
import ao.com.spring.services.EmpresaService;

@SpringBootApplication
public class SpringProjectApplication {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private EmpresaService empresaService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args -> {
//			String encoded = PasswordUtils.generatePassword("123456");
//			System.out.println("Encoded: " + encoded);
//			
//			encoded = PasswordUtils.generatePassword("123456");
//			System.out.println("Encoded: " + encoded);
//			
//			System.out.println("Matches: " + PasswordUtils.checkPassword("123456", encoded));
			
//			Empresa empresa = new Empresa();
//			empresa.setRazaoSocial("primeira empresa");
//			this.empresaRepository.save(empresa);
//			
//			Empresa empresa1 = new Empresa();
//			empresa1.setRazaoSocial("primeira empresa 11");
//			this.empresaRepository.save(empresa1);
//			
//			List<Empresa> persistidas = this.empresaRepository.findAll();
//			persistidas.forEach(System.out::println);
//			
//			Empresa persistida1 = this.empresaRepository.findOne(1L);
//			System.out.println(persistida1);
//			
//			Empresa persistidaPrimeiraEmpresa = this.empresaRepository.findByRazaoSocial("primeira empresa");
//			System.out.println(persistidaPrimeiraEmpresa);
//			
//			this.empresaRepository.delete(1L);
//			this.empresaRepository.findAll().forEach(System.out::println);
			
//			this.empresaService.imprime();
//		};
//	}
}