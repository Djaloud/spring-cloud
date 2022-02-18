package com.example.demo;

import com.example.demo.Dao.EtudiantRepository;
import com.example.demo.entities.etudiant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceEtudiantApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroserviceEtudiantApplication.class, args);
	}
    @Bean
	CommandLineRunner start(EtudiantRepository etudiantRepository){
		return args -> {
			Stream.of("Djaloud","Yassine").forEach(cn->{
				etudiantRepository.save(new etudiant(0,cn,50+Math.random()*900));
			});
			etudiantRepository.findAll().forEach(System.out::println);
		};
	}
}
