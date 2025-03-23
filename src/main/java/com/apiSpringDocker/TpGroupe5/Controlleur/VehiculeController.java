package com.apiSpringDocker.TpGroupe5.Controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiSpringDocker.TpGroupe5.Entity.Vehicule;
import com.apiSpringDocker.TpGroupe5.Service.VehiculeService;

@RestController
@RequestMapping("/api/vehicule")
public class VehiculeController {
	
	@Autowired
	private VehiculeService vehiculeService;
	
	
	@GetMapping("/insert")
	public Vehicule InsertVehicule(@RequestBody  Vehicule vehicule){
		
		return vehiculeService.CreateVehicule(vehicule);
		
	}
	
	@GetMapping("/findAll")
	
	public List<Vehicule> getAllVehicules(){
		
		return vehiculeService.getVehicules();
		
	}
	
	 @GetMapping("/{id}")
	    public Vehicule getVehicule(@PathVariable int id) {
	        return vehiculeService.getVehiculeById(id);
	    }
	 
	 	@PostMapping()
	    public Vehicule createVehicle(@RequestBody Vehicule vehicule) {
	        return vehiculeService.CreateVehicule(vehicule);
	    }

	    @PutMapping("/{id}")
	    public Vehicule updateVehicule(@PathVariable int id, @RequestBody Vehicule vehicule) {
	        return vehiculeService.updateVehicule(id, vehicule);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteVehicle(@PathVariable int id) {
	        vehiculeService.deleteVehicule(id);
	    }

	    @GetMapping("/search/byNumRegister/{numRegister}")
	    public Vehicule searchByNumRegister(@PathVariable String numRegister) {
	        return vehiculeService.findByNumRegister(numRegister);
	    }
	 
	    @GetMapping("/search/byPrice/{price}")
	    public List<Vehicule> searchByPrice(@PathVariable double price) {
	        return vehiculeService.findByPrice(price);
	    }
}
