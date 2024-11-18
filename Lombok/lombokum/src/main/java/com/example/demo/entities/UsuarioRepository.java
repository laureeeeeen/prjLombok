package com.example.demo.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.repositories.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	

}
