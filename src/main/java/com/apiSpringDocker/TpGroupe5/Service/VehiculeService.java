package com.apiSpringDocker.TpGroupe5.Service;

import java.util.List;

import com.apiSpringDocker.TpGroupe5.Entity.Vehicule;

public interface VehiculeService {
	
	Vehicule getVehiculeById(int id);
	Vehicule CreateVehicule(Vehicule vehicule);
	List<Vehicule> getVehicules();
	Vehicule updateVehicule(int id, Vehicule vehicle);
    void deleteVehicule(int id);
    Vehicule findByNumRegister(String numRegister);
    List<Vehicule> findByPrice(double price);

}
