package br.com.alura.scrrenmatch;

import br.com.alura.scrrenmatch.exemplos.Exemplos;
import br.com.alura.scrrenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrrenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScrrenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.ExibeMenu();
//		Exemplos exemplos = new Exemplos();
//		exemplos.ExibeMenu();

	}
}
