package com.example.demo.Dao;

import com.example.demo.entities.etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<etudiant,Long> {
}
