package com.cjc.CarsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.CarsModel.Cars;

@Repository

public interface CarsRepository extends JpaRepository<Cars, Integer>
{

}
