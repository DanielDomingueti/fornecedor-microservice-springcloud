package br.com.alura.microservice.fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.model.Produto;
import br.com.alura.microservice.fornecedor.repository.InfoRepository;
import br.com.alura.microservice.fornecedor.repository.ProdutoRepository;

@SpringBootApplication
@EnableEurekaClient
public class FornecedorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FornecedorApplication.class, args);
	}

}
