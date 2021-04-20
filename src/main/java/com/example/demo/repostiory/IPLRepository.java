package com.example.demo.repostiory;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.IPLSchedule;

public interface IPLRepository extends JpaRepository<IPLSchedule,Integer> {

	IPLSchedule findByDate(String date);

}
