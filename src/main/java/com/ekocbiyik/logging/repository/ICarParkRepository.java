package com.ekocbiyik.logging.repository;

import com.ekocbiyik.logging.entity.CarPark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarParkRepository extends JpaRepository<CarPark, Long> {
}
