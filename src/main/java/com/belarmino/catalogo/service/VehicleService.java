package com.belarmino.catalogo.service;

import com.belarmino.catalogo.model.Vehicle;
import com.belarmino.catalogo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> list(){
        return vehicleRepository.findAll();
    }

    public Vehicle save(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Vehicle update(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public void delete(Integer id){
        vehicleRepository.deleteById(id);
    }
}
