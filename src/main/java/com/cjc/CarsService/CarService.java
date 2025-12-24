package com.cjc.CarsService;

import java.util.List;

import com.cjc.CarsModel.Cars;

public interface CarService {

	
	Cars addcars(Cars ca);
	Cars getcar(Integer id);
	Cars updatecar(Integer id, Cars cr);
	Cars editcars(Integer id, Cars cr);
	List<Cars> getallcars();
	String deletecar(Integer id);
}
