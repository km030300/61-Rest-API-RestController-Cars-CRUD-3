package com.cjc.CarsServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarsModel.Cars;
import com.cjc.CarsRepository.CarsRepository;
import com.cjc.CarsService.CarService;

@Service
public class CarsServiceImpl implements CarService {
	@Autowired
	 private CarsRepository carrepo;

	@Override
	public Cars addcars(Cars ca) {
		Cars save = carrepo.save(ca);
		return save;
	}

	@Override
	public Cars getcar(Integer id) {
		if(carrepo.existsById(id)) {
		  Cars getcar = carrepo.findById(id).get();
		  
		  return getcar;
		}
		return null;
	} 

	@Override
	public Cars updatecar(Integer id, Cars cr) {
		if(carrepo.existsById(id)) {
		Cars	dbcar=carrepo.findById(id).get();
		dbcar.setCname(cr.getCname());
		dbcar.setCprice(cr.getCprice());
		
		Cars upsave = carrepo.save(dbcar);
		return upsave;
		}
		return null;
	}

	@Override
	public Cars editcars(Integer id, Cars cr) {
		if(carrepo.existsById(id)) {
			Cars credit=carrepo.findById(id).get();
			
			if(cr.getCname()!=null) {
				credit.setCname(cr.getCname());
				
			}
			if(cr.getCprice()!=null) {
				credit.setCprice(cr.getCprice());
			}
			Cars editsave = carrepo.save(credit);
			return editsave;
		}
		return null;
	}

	@Override
	public List<Cars> getallcars() {
		List<Cars> findAll = carrepo.findAll();
		return findAll;
	}

	@Override
	public String deletecar(Integer id) {
		String msg="";
		if(carrepo.existsById(id))
		{
			carrepo.deleteById(id);
			msg="Car Details Deleted Successfully"+id;
			return msg;
			
		}
		msg="ID not Found";
		return msg;
	}

}
