package com.cjc.CarsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.CarsModel.Cars;
import com.cjc.CarsService.CarService;

@RestController
public class CarsController {
	
	@Autowired
	private CarService carservice;
	
	@PostMapping(value = "/addcars")
	public Cars Addcars(@RequestBody Cars ca) {
		Cars cars = carservice.addcars(ca);
		return cars;
	}
	
	@GetMapping(value = "/getcar/{id}")
	public Cars getcar(@PathVariable int id) {
		
		Cars getcar = carservice.getcar(id);
		return getcar;
	}
	
	@PutMapping(value = "/updatecar/{id}")
	public Cars updateinfo(@PathVariable int id, @RequestBody Cars ca) {
		
		Cars updatecar = carservice.updatecar(id, ca);
		return updatecar;
		
	}
	
	@PatchMapping(value = "/eidtfield/{id}")
	public Cars editfiled(@PathVariable int id, @RequestBody Cars cr) {
		Cars editcars = carservice.editcars(id, cr);
		return editcars;
		
	}
	
	@GetMapping("/getallcars")
	public List<Cars> getallacaes(){
		List<Cars> getallcars = carservice.getallcars();
		return getallcars;
		
	}
	
	@DeleteMapping(value = "/deletecar/{id}")
	public String deletecar(@PathVariable int id) {
		String deletecar = carservice.deletecar(id);
		return deletecar;
	}

}
