package com.apiSpringDocker.TpGroupe5.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiSpringDocker.TpGroupe5.Entity.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {
	
	Vehicule findByNumRegister(String numRegister);
    List<Vehicule> findByPrice(double price);
	

}
