package com.apiSpringDocker.TpGroupe5.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiSpringDocker.TpGroupe5.Entity.Vehicule;
import com.apiSpringDocker.TpGroupe5.Repository.VehiculeRepository;

@Service
public class VehiculeServiceImpl implements VehiculeService{
	
	@Autowired
	private VehiculeRepository vehiculeRepository;
	

	@Override
	public Vehicule CreateVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public List<Vehicule> getVehicules() {
		// TODO Auto-generated method stub
		return vehiculeRepository.findAll();
	}

	 @Override
	    public Vehicule updateVehicule(int id, Vehicule vehicule) {
	        if (vehiculeRepository.existsById(id)) {
	            vehicule.setId(id);;
	            return vehiculeRepository.save(vehicule);
	        }
	        return null;
	    }

	    @Override
	    public void deleteVehicule(int id) {
	        vehiculeRepository.deleteById(id);
	    }

	    @Override
	    public Vehicule findByNumRegister(String numRegister) {
	        return vehiculeRepository.findByNumRegister(numRegister);
	    }

	    @Override
	    public List<Vehicule> findByPrice(double price) {
	        return vehiculeRepository.findByPrice(price);
	    }

	@Override
    public Vehicule getVehiculeById(int id) {
        Optional<Vehicule> vehicleOptional = vehiculeRepository.findById(id);
        return vehicleOptional.orElse(null);
    }

}
